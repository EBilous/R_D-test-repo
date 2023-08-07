package src.home_work.LEC21.lambda;

/*  Створити клас студент з полями Прізвище та Середній бал.
    Написати два компаратори для сортування по цим полям.
    У головному класі наповнити лист даними про студентів та відсортувати за допомогою цих компараторів.
    Показати на консоль 3 варіанти листа: оригінальний та 2 відсортованих.*/

import java.util.Comparator;

public record Student(String lastName, Double averageGrade) {

    @Override public String toString() {
        return "Student{" +
            "lastName='" + lastName + '\'' +
            ", averageGrade=" + averageGrade +
            '}';
    }
}

class LastNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.lastName().compareTo(s2.lastName());
    }
}

class AverageGradeComparatorAscending implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.averageGrade(), s2.averageGrade());
    }
}

class AverageGradeComparatorDescending implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.averageGrade(), s1.averageGrade());
    }
}
