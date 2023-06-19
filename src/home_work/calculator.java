package src.home_work;

import java.util.Scanner;

public class calculator {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        int first_value = scanner.nextInt();
        System.out.println("Enter 2nd value: ");
        int second_value = scanner.nextInt();
        System.out.println("Enter operation: ");
        int action = scanner.nextInt();

        switch (action) {
            case 1 -> System.out.println(plusing(first_value,second_value));
            case 2 -> System.out.println(minusing(first_value, second_value));
            case 3 -> System.out.println(multiplying(first_value, second_value));
            case 4 -> System.out.println(dividing(first_value, second_value));
            default -> throw new IllegalStateException("Unexpected value: " + action);
        }
    }

    public static int plusing(int first_value, int second_value) {
        return first_value + second_value;
    }
    public static int minusing(int first_value, int second_value) {
        return first_value - second_value;
    }
    public static int multiplying(int first_value, int second_value) {
        return first_value * second_value;
    }
    public static int dividing(int first_value, int second_value) {
        return first_value / second_value;
    }
}
