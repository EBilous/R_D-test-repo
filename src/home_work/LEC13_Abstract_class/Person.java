package src.home_work.LEC13_Abstract_class;

abstract class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected int cardId;

    public Person(String name, String surname, int age, int cardId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cardId = cardId;
    }

    public abstract void showInfo();
}
