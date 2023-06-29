package src.home_work;


import java.util.Scanner;

public class HW2_DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first integer: ");
        int first = Integer.parseInt(input.nextLine());

        System.out.println("Please enter the second integer: ");
        int second = Integer.parseInt(input.nextLine());

        // %s is a placeholder for a variable passed in parameters of the method
        /* %n is a line break character which is used to print output in a new line, as printf doesn't add new line by default
        unlike the println method.
        * */
        System.out.printf("Sum of variables %s and %s = " + (first + second) + "%n", first, second);
        System.out.printf("Subtraction of variables %s and %s = " + (first - second) + "%n", first, second);
        System.out.printf("Multiplication of variables %s and %s = " + (first * second) + "%n", first, second);
        System.out.printf("Division of variables %s and %s = " + ((float) first / second) + "%n", first, second);
        System.out.println(String.format("Is %s greater than %s? ", first, second) + (first>second));
    }
}
