package src.lections.LEC20;

/*
 1 ArrayList
 Напишіть програму - яка зчитує слово з консолі, працює до тих пір поки користувач не введе слово No, якщо
 користувач вводить слово Yes - програма питає у нього слово - яке б додавало до арай лісту,
 коли користувач - вводить слово No - програма виводить ліст на екран і завершує роботу

 додатково - через те що це ліст, додати перевірку перед додаванням чи додається таке саме слово - якщо так
 то вивести на екран наступне - ви ввели слово яке вже додано, введіть будь-ласка інше
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean retry = true;

        List<String> myList = new ArrayList<>();
        while (retry) {
            System.out.println("Будь ласка введіть слово: ");

            String word= input.nextLine();

            if (myList.contains(word)) {
                System.out.println("Ви ввели слово яке вже додано, введіть будь-ласка інше");
            } else {
                myList.add(word);
            }

            System.out.println("Бажаєте продовжити ? (Yes/No): ");

            if (!input.nextLine().equalsIgnoreCase("yes")) {
                retry = false;
            }
        }
        System.out.println("Дякуємо за візит!");
        System.out.println(myList);
    }

}
