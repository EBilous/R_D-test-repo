package src.lections.LEC23.practice;

/*
        Завдання 1: Вибір студентів за середнім балом
        Завдання:
        Необхідно вибрати зі списку студентів тих,
        хто має середній бал вище певного порогу,
        відсортувати їх за прізвищем і повернути перші 5 студентів у вигляді списку імен.
         */

import java.util.List;
import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private List<Integer> listOfGrades;

    public Student(String firstName, String lastName, List<Integer> listOfGrades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.listOfGrades = listOfGrades;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getListOfGrades() {
        return listOfGrades;
    }

    public void setListOfGrades(List<Integer> listOfGrades) {
        this.listOfGrades = listOfGrades;
    }

    public double getAverageGrade() { return listOfGrades.stream().mapToInt(Integer::intValue).average().orElse(0D);}

    public List<String> getTopStudentsByAgp (List<Student> students, int limit, double threshold) {
        /*students.stream().forEach(getFirstName(),
            getLastName(),
            getAverageGrade());*/
    return null;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;

        if (!Objects.equals(firstName, student.firstName)) {
            return false;
        }
        if (!Objects.equals(lastName, student.lastName)) {
            return false;
        }
        return Objects.equals(listOfGrades, student.listOfGrades);
    }

    @Override public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (listOfGrades != null ? listOfGrades.hashCode() : 0);
        return result;
    }

    @Override public String toString() {
        return "Student{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", listOfGrades=" + listOfGrades +
            '}';
    }

    public String toStringAvg() {
        return "Student{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", agp=" + getAverageGrade() +
            '}';
    }
}
