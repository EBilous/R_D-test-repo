package src.lections;

import java.util.Arrays;

public class minMaxValueInArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 4, 5, 6};

        System.out.println(Arrays.stream(array1).min());
        System.out.println(Arrays.stream(array1).max());
    }
}
