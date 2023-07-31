package src.home_work.LEC17.collections.LEC19.maps;

/*Мапа має містити інформацію про 10 будь-яких слів українською мовою і її переклад на: англійску, японську, німецьку.
 Коли користувач дає мапі слово українською - то потрібен отримати у результаті переклад на ці 3 мови*/


/*  "привіт"
    "дякую"
    "будь ласка"
    "кохання"
    "добре"
    "робота"
    "школа"
    "сонце"
    "вода"
    "мир"   */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean retry = true;

        while (retry) {
            System.out.println("Будьласка введіть слово: ");
            UkrainianTranslations.getTranslation(input.nextLine().toLowerCase());
            System.out.println("Бажаєте продовжити переклад? (так/ні): ");

            if (!input.nextLine().equalsIgnoreCase("так")) {
                retry = false;
            }
        }
        System.out.println("Дякуємо за візит!");
    }
}