package src.home_work.LEC13_Abstract_class;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String surname, int age, int cardId, String subject) {
        super(name, surname, age, cardId);
        this.subject = subject;
    }

    public void showInfo() {
        System.out.println("Teacher Information:");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Card ID: " + cardId);
        System.out.println("Subject: " + subject);
        System.out.println();
    }
}
