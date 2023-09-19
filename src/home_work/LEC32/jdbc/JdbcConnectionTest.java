package src.home_work.LEC32.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionTest {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3316/rd_db";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a JDBC connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            if (connection != null) {
                System.out.println("Connected to the database!");
                // You can use the 'connection' object to perform database operations.
                // For example, execute SQL queries, insert, update, or delete data.

                // Remember to close the connection when you're done.
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Connection error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

