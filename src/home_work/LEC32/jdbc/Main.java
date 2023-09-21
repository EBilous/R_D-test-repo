package src.home_work.LEC32.jdbc;

import java.sql.Connection;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection;
        connection = DatabaseConnection.getInstance().getConnection();

        try {
            Student student = new Student("John", "Doe", "Historical", 1);
            Student student2 = new Student("John", "Wick", "Computer Science", 2);

            student.insert(connection);
            student2.insert(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
