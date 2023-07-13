package src.home_work.LEC13_Abstract_class;

public class Main {
    public static void main(String[] args) {
        Person teacher = new Teacher("John", "Doe", 35, 12345, "Alchemy");
        teacher.showInfo();

        Person student = new Student("Jane", "Smith", 19, 54321, 12);
        student.showInfo();
    }
}
