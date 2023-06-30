package src.home_work.HW8_Incapsulation;


/*  1. Створити клас, який описує студента та клас для опису викладача
    2. Створити клас для роботи с масивом чисел. Він повинен вміти:
        - створювати масив з випадковими числами с заданим розміром
        - сортувати масив у дві сторони
        - вивести на консоль масив*/

public class Student {
    private String name;
    private String surname;
    private String dateOfBirth;
    private String groupId;
    private String specialty;
    private long studentCardId;
    private double gpa;

    public Student(String name, String surname, String dateOfBirth, String groupId, String specialty, Long studentCardId, Double gpa) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.groupId = groupId;
        this.specialty = specialty;
        this.studentCardId = studentCardId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public long getStudentCardId() {
        return studentCardId;
    }

    public void setStudentCardId(long studentCardId) {
        this.studentCardId = studentCardId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getStudentProfile() {
        return String.join(" ", getName(), getSurname(), getDateOfBirth(), String.valueOf(getGpa()), getGroupId());
    }
}
