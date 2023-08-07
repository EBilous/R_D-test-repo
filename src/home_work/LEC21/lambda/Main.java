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
        studentsList.forEach(System.out::println);

        studentsList.sort(new LastNameComparator());
        System.out.println("\nSorted by Last Name:");
        studentsList.forEach(System.out::println);

        studentsList.sort(new AverageGradeComparatorDescending());
        System.out.println("\nSorted by Average Grade Descending:");
        studentsList.forEach(System.out::println);

        studentsList.sort(new AverageGradeComparatorAscending());
        System.out.println("\nSorted by Average Grade Ascending:");
        studentsList.forEach(System.out::println);
        }
}
