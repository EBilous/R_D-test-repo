package src.home_work.LEC32.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student {
    private int id;
    private final String firstName;
    private final String lastName;
    private final String faculty;
    private final int universityId;

    public Student(String firstName, String lastName, String faculty, int universityId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.universityId = universityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getUniversityId() {
        return universityId;
    }
    
    public void insert(Connection connection) throws SQLException {
        String insertQuery = "INSERT INTO student (first_name, last_name, faculty, university_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, faculty);
            preparedStatement.setInt(4, universityId);

            preparedStatement.executeUpdate();
        }
    }

    // Update an existing student record in the database
    public void update(Connection connection) throws SQLException {
        String updateQuery = "UPDATE student SET first_name = ?, last_name = ?, faculty = ?, university_id = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, faculty);
            preparedStatement.setInt(4, universityId);
            preparedStatement.setInt(5, id);

            preparedStatement.executeUpdate();
        }
    }

    // Delete a student record from the database
    public void delete(Connection connection) throws SQLException {
        String deleteQuery = "DELETE FROM student WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        }
    }
}
