package src.home_work.LEC16.collections;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", 20);
        Student student2 = new Student("Jane", "Smith", 22);
        Student student3 = new Student("Alice", "Johnson", 19);
        Student student4 = new Student("Julianne", "Cremin", 27);

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);

        List<Student> studentsList = studentManager.getStudents();
        for (Student student : studentsList) {
            System.out.println("FirstName: " + student.getFirstname() + ", LastName: " + student.getLastName() + ", Age: " + student.getAge());
        }
        Iterator<Student> iter = studentsList.listIterator();
        while (iter.hasNext()) {
            Student lis = iter.next();
            System.out.println(lis.getFirstname() + " " + lis.getLastName() + " " + lis.getAge());
        }
    }
}