package src.lections;

/*практика по ініціалізації :
        Завдання 1: Клас з різними типами конструкторів та блоками ініціалізації

        Створіть клас Car, який має такі поля:

        make (марка автомобіля, строка)
        model (модель, строка)
        year (рік випуску, ціле число)
        Додайте наступні елементи:

        Конструктор за замовчуванням, який ініціалізує make та model як "Not specified", а year як 2000.
        Параметризований конструктор, що приймає make, model та year.
        Блок ініціалізації, який виводить повідомлення "A new car is created".*/
public class Car {

    private String make;
    private String model;
    private int year;

    {
        System.out.println("A new car is created");
    }

    public Car() {
        this.make = "Not specified";
        this.model = "Not specified";
        this.year = 2000;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Car obj = new Car();
    }
}
