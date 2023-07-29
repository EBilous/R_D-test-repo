package src.home_work.LEC16.collections;

import java.util.ArrayList;

public class StudentManager {
    private final ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
