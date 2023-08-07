package src.lections.LEC21.streams;


import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Задача 1: Написати лямбда-функцію, яка повертає довжину рядка.
        Function<String, Integer> myLength = (str) -> str.length();
        System.out.println(myLength.apply("My name is Eugene"));

        Function<String, Integer> myLength2 = String::length;
        System.out.println(myLength2.apply("My name is Eugene"));

        // Написати лямбда-функцію, яка перевіряє, чи є число парним.
        Predicate<Integer> result = i -> i % 2 == 0;
        System.out.println(result.test(5));
        System.out.println(result.test(4));

        // Задача 3: Використовуючи Stream API, знайти максимальне число в списку.

        List<Integer> newList = Stream.of(23, 45, 33, 99).toList();
        System.out.println(newList.stream().max(Integer::compare));

        // Використовуючи Stream API, вибрати всі рядки в списку, що починаються з певної букви (скажімо, "a").

        List<String> stringsList = Stream.of("Aviation", "Navy", "aircraft", "Tank")
            .toList().stream()
            .filter(word -> word.toLowerCase().startsWith("a"))
            .toList();

        System.out.println(stringsList);

        // Задача 5: Використовуючи Stream API, обчислити суму всіх чисел в списку.

        List<Integer> sum = Collections.singletonList(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
            .toList().stream().mapToInt(Integer::intValue).sum());

        System.out.println(sum);
    }
}
