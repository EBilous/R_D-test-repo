package src.lections.LEC23.practice;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = List.of(
            new Student("Eugene", "Bilous", List.of(5, 4, 5, 3, 4)),
            new Student("Andrew", "Parmik", List.of(5, 4, 5, 5, 4)),
            new Student("Michael", "Brown", List.of(5, 2, 1, 1, 3)),
            new Student("Emily", "Williams", List.of(3, 5, 3, 2, 5)),
            new Student("Drew", "Johnson", List.of(3, 4, 1, 5, 3)),
            new Student("Michael", "Williams", List.of(2, 2, 4, 5, 2)),
            new Student("Peppa", "The-pig", List.of(2, 1, 3, 4, 3)),
            new Student("John", "Doe", List.of()));

        //System.out.println(studentstoStringAvg());
    }
}
