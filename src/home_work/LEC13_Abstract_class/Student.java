package src.home_work.LEC13_Abstract_class;

public class Student extends Person {
    private int grade;

    public Student(String name, String surname, int age, int cardId, int grade) {
        super(name, surname, age, cardId);
        this.grade = grade;
    }

    public void showInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Card ID: " + cardId);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}
