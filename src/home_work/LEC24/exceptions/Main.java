package src.home_work.LEC24.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /*1.
    - Запросити з консолі число і огорнути цей функціонал у блоки обробки винятків.
    - При вводі замість числа  букв - показувати повідомлення про помилку на консоль.
    - За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо його без помилок*/
    public static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введіть число: ");
            int input = scanner.nextInt();
            System.out.println(input);
        } catch (InputMismatchException e) {
            System.out.println("Ви ввели не Integer, спробуйте ще раз");
            firstTask();
        } finally {
            scanner.close();
            System.out.println(scanner.hashCode());
        }
    }

    /*Створити виняток який викидається коли число менше нуля. Створити функцію, яка приймає число і повертає його квадрат.
 Якщо число буде менше нуля - то викинути створений вийняток*/

    public static int secondTask(Integer value) {
        try {
            if (value >= 0) {
                return value * value;
            } else {
                throw new EugenesException("Ви ввели відʼємне число", 400);
            }
        } catch (EugenesException e) {
            System.out.println("Message: " + e.getMessage() + "\n" + "Error: " + e.getErrorCode());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 0;
    }


    public static void main(String[] args) {
        firstTask();

        System.out.println("------------------------------");

        System.out.println("Result: " + secondTask(-2));

    }
}
