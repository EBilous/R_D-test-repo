package src.home_work;

import java.util.Arrays;
import java.util.Random;

/*  Створити програму в якій потрібно створити масив з 10 елементів та заповнити його випадковими числами
        Вивести його на консоль
        Знайти мінімальне значення
        Знайти максимальне значення
        Знайти середнє значення
        Знайти суму всіх елементів*/
public class HW7_Arrays {
    public static final int range = 99;
    private final static Random randomiser = new Random();

    public static void main(String[] args) {
        int[] myArray = new int[10];


        for (int i = 0; i < 10; i++) {
            myArray[i] = randomiser.nextInt(range);
        }
        System.out.println(Arrays.deepToString(new Object[]{myArray}));

        arrayOperations(myArray);
        System.out.println("Minimal value is: " + min(myArray));
        System.out.println("Maximal value is: " + max(myArray));
        System.out.println("Average value is: " + average(myArray));
        System.out.println("Sum of elements is: " + sum(myArray));

    }
        // realization
    public static void arrayOperations(int [] array) {


        System.out.println("Minimal value is: " + Arrays.stream(array).min());
        System.out.println("Maximal value is: " + Arrays.stream(array).max());
        System.out.println("Average value is: " + Arrays.stream(array).average());
        System.out.println("Sum of elements is: " + Arrays.stream(array).sum());
    }

    // realization with for cycle
    public static int max(int[] array) {
        int max = 0;

        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static int min(int[] array) {
        int min = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    public static double average(int[] array) {
        int avg = 0;

        for (int j : array) {
                avg +=j;
            }
        return (double) avg / array.length;
    }
    public static int sum(int[] array) {
        int sum = 0;

        for (int j : array) {
            sum +=j;
        }
        return sum;
    }




}
