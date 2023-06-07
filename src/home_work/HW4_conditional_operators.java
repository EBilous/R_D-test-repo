package src.home_work;

import java.util.Scanner;

/*Створити 3 програми:

програму для знаходження більшого з двох чисел

програму для знаходження меншого з двох чисел

програму для перевірка заданого числа на парність

*/
public class HW4_conditional_operators {
    public static void isBigger() {
        Scanner scanner = new Scanner(System.in);

        String inp = "y";
        // which number is bigger
        while (inp.equalsIgnoreCase("y")) {
            System.out.println("Please enter the first number: ");
            int first_value = scanner.nextInt();
            System.out.println("Please enter the second number: ");
            int second_value = scanner.nextInt();
            if (first_value == second_value) {
                System.out.println("The values are equal!");
            }
            else {
                // which number is bigger
            System.out.println(first_value > second_value ? "First number is bigger" : "Second number is bigger");
                // which number is smaller
            System.out.println(first_value < second_value ? "First number is lower" : "Second number is lower");
            }
            // Is the number EVEN or ODD
            System.out.println("Please enter the value to check if it is an even: ");
            int value = scanner.nextInt();
            System.out.println(value % 2 == 0 ? "Even" : "Odd");


            System.out.println("Would you try once again Y/N ? ");
            inp = scanner.next();
        }
        System.out.println("See you :)");
    }

    public static void main(String[] args) {
        isBigger();
    }
}