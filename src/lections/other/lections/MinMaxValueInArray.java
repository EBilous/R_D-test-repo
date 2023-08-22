package src.lections.other.lections;

import java.util.Arrays;

public class MinMaxValueInArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 4, 5, 6};

        System.out.println(Arrays.stream(array1).min());
        System.out.println(Arrays.stream(array1).max());
    }
}
