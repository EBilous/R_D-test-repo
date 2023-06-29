package src.home_work;

import java.util.Scanner;

/*завдання з зірочкою для світч :  (це мало б бути без додаткових моментів)
    Написати програму, що конвертує числа від 1 до 7 в дні тижня.
    Написати програму, що приймає оцінку (від A до F) та виводить повне значення оцінки ("Excellent", "Good", "Fair", "Poor").
    і ще одне :
    Написати програму, яка приймає вік користувача та виводить категорію віку (наприклад, дитина, підліток, дорослий, літній чоловік).
    Діапазон нехай буде такий :
    Дитина 0-12, підліток 13-17, дорослий 18-50, літній 51-100)
    9:42
    не забувайте ще додавати перевірки (наприклад) - якщо в ваш метод як інпут закинуть -3*/
public class HW4_ExtraTasks {
    public static void main(String[] args) {
        dayOfWeek();
        ager();

    }

    public static void dayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        // int dayOfWeek = Integer.parseInt(scanner.nextLine());
        System.out.println("Please type integer to show the related day of the week: ");
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("This is not any of the week day");
        }
    }

    public static void ager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please say us how old are you: ");
        final int child_min = 0;
        final int child_max = 12;
        final int teenager_min = 13;
        final int teenager_max = 17;
        final int adult_min = 18;
        final int adult_max = 50;
        final int pens_min = 51;
        final int pens_max = 100;

        int age = Integer.parseInt(scanner.nextLine());
        if ((child_min < age) && (child_max > age) || (age == child_min) || (age == child_max)) {
            System.out.println("Your are child");
        } else if ((teenager_min < age) && (teenager_max > age) || (age == teenager_min) || (age == teenager_max)) {
            System.out.println("Your are teenager");
        } else if ((adult_min < age) && (adult_max > age) || (age == adult_min) || (age == adult_max)) {
            System.out.println("Your are an adult");
        } else if ((pens_min < age) && (pens_max > age) || (age == pens_min) || (age == pens_max)) {
            System.out.println("Your are pens");
        } else
            System.out.println("Sorry, the entered value isn't acceptable");
    }
}