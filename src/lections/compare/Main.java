package src.lections.compare;

public class Main {

    public static void main(String[] args) {
        Comparable eugene = new Student("Eugene", 4.3F);
        Student ivan = new Student("Ivan", 4.5F);
        Student alex = new Student("Alex", 4.5F);

        eugene.compareTo(ivan);
        ivan.compareTo(alex);
    }
}
