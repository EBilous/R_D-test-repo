package src.home_work.LEC32.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private Connection connection;

    private DatabaseConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "";
            String base_url = "jdbc:mysql://localhost:3316/";

            // Підключення без вказівки схеми
            Connection initialConnection = DriverManager.getConnection(base_url, user, password);
            String dbName = "rd_db";
            try (Statement statement = initialConnection.createStatement()) {
                // Створення схеми, якщо вона не існує
                statement.execute("CREATE DATABASE IF NOT EXISTS " + dbName);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            initialConnection.close();

            // Підключення до створеної (або існуючої) схеми
            String url = base_url + dbName;
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        } else if (instance.getConnection().isClosed()) {
            synchronized (DatabaseConnection.class) {
                if (instance == null || instance.getConnection().isClosed()) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}


