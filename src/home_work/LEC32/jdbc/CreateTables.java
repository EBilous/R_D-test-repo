package src.home_work.LEC32.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {

    public static void main(String[] args) throws SQLException {
        Connection connection;
        connection = DatabaseConnection.getInstance().getConnection();
        try {
            // Create tables
            createCountryTable(connection);
            createCityTable(connection);
            createUniversityTable(connection);
            createStudentTable(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createCityTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE city (" +
            "id INT AUTO_INCREMENT PRIMARY KEY," +
            "name VARCHAR(255) NOT NULL," +
            "postal_code VARCHAR(255)," +
            "country_id INT NOT NULL," +
            "FOREIGN KEY (country_id) REFERENCES country(id)" +
            ")";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'city' created successfully.");
        }
    }

    private static void createCountryTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE country (" +
            "id INT AUTO_INCREMENT PRIMARY KEY," +
            "name VARCHAR(255) NOT NULL" +
            ")";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'country' created successfully.");
        }
    }

    private static void createUniversityTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE university (" +
            "id INT AUTO_INCREMENT PRIMARY KEY," +
            "name VARCHAR(255) NOT NULL," +
            "country_id INT NOT NULL," +
            "city_id INT," +
            "FOREIGN KEY (country_id) REFERENCES country(id)," +
            "FOREIGN KEY (city_id) REFERENCES city(id)" +
            ")";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'university' created successfully.");
        }
    }

    private static void createStudentTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE student (" +
            "id INT AUTO_INCREMENT PRIMARY KEY," +
            "first_name VARCHAR(255) NOT NULL," +
            "last_name VARCHAR(255) NOT NULL," +
            "faculty VARCHAR(255) NOT NULL," +
            "university_id INT NOT NULL," +
            "FOREIGN KEY (university_id) REFERENCES university(id)" +
            ")";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'student' created successfully.");
        }
    }
}

