package src.home_work.LEC21.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Bilous", 85.0D));
        studentsList.add((new Student("Zhuravlov", 95D)));
        studentsList.add(new Student("Abrams", 85.0));
        studentsList.add(new Student("Johnson", 92.5));
        studentsList.add(new Student("Williams", 78.3));
        studentsList.add(new Student("Brown", 88.7));
        studentsList.add(new Student("Jones", 76.9));

        System.out.println("Original List:");
        for (Student student : studentsList) {
            System.out.println(student);
        }

        studentsList.sort(new LastNameComparator());
        System.out.println("\nSorted by Last Name:");
        for (Student student : studentsList) {
            System.out.println(student);
        }

        studentsList.sort(new AverageGradeComparatorDescending());
        System.out.println("\nSorted by Average Grade Descending:");
        for (Student student : studentsList) {
            System.out.println(student);
        }

        studentsList.sort(new AverageGradeComparatorAscending());
        System.out.println("\nSorted by Average Grade Ascending:");
        for (Student student : studentsList) {
            System.out.println(student);
        }


    }
}
