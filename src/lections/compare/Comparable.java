package src.lections.compare;

/*Завдання 5: Інтерфейс "Comparable"

    Створіть інтерфейс "Comparable" з методом "compareTo()".
    Створіть клас "Student" з полями "name" та "gradePointAverage".
    Реалізуйте інтерфейс "Comparable", щоб студенти могли порівнюватися за середнім балом.*/

public interface Comparable {

    void compareTo(Student student);
}
