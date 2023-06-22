package src.lections;


import java.util.Arrays;
import java.util.Random;

/* Завдання: Створіть масив цілих чисел та обчисліть суму всіх чисел в масиві.*/

public class sumOfArrayElements {
    public static final int range = 10;
    private final static Random randomiser = new Random();

    public static void main(String[] args) {

        int [] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = randomiser.nextInt(range);
        }
        int sum = 0;
        for (int j : array1) {
            sum = sum + j;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(sum);
    }
}
