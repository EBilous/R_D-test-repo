package src.home_work.LEC22.stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/*1.    Створити лист з 20 прізвищами. Вони повинні повторюватися. За допомогою стрім апі перетворити цей лист на мапу.
        У якості ключа повинно бути прізвище, а я якості значення кількість повторень його.

2.      Заповнити лист випадковими числами. Знайти суму цих чисел за допомогою Stream API*/

public class stream2 {

    protected static List<String> surnames = new ArrayList<>();

    public static void main(String[] args) {

        surnames.add("Martinez");
        surnames.add("Robinson");
        surnames.add("Smith");
        surnames.add("Johnson");
        surnames.add("Williams");
        surnames.add("Brown");
        surnames.add("Jones");
        surnames.add("Davis");
        surnames.add("Miller");
        surnames.add("Wilson");
        surnames.add("Moore");
        surnames.add("Taylor");
        surnames.add("Smith");
        surnames.add("Johnson");
        surnames.add("Williams");
        surnames.add("Brown");
        surnames.add("Jones");
        surnames.add("Davis");
        surnames.add("Miller");
        surnames.add("Wilson");
        surnames.add("Moore");
        surnames.add("Smith");

        /*System.out.println("List of Surnames:");
        surnames.stream().sorted().forEach(System.out::println);*/

        groupedBySurname();
        someList();
    }

    public static void groupedBySurname() {
        //Створити лист з 20 прізвищами. Вони повинні повторюватися. За допомогою стрім апі перетворити цей лист на мапу.
        //        У якості ключа повинно бути прізвище, а я якості значення кількість повторень його.

        Map<String, Long> popularSurnames = surnames.stream()
            .collect(Collectors.groupingBy(surname -> surname, Collectors.counting()));

        System.out.println("Surname Count Map:");
        popularSurnames.forEach((surname, value) -> System.out.println(surname + ": " + value));
    }

    public static void someList() {
        //Заповнити лист випадковими числами. Знайти суму цих чисел за допомогою Stream API

        int size = 10;
        int min = 55;
        int max = 99;

        List<Integer> numbers = new Random().ints(size, min, max)
            .boxed().toList();

        System.out.println(numbers.stream().reduce(Integer::sum));
    }
}
