package src.lections;

// Зреверсуйте масив без використання додаткового масиву.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, arr.length);

        List<Integer> objectArr = List.of(1, 2, 3, 4, 5);
        System.out.println(reverse(objectArr));
    }

    public static void reverse(int[] array, int len) {
        int index, k, t;
        for (index = 0; index < len / 2; index++) {
            t = array[index];
            array[index] = array[len - index - 1];
            array[len - index - 1] = t;
        }

        System.out.println("Reversed array: \n");
        for (k = 0; k < len; k++) {
            System.out.println(array[k]);
        }
    }

    // additional variant for practice
    public static Collection<Integer> reverse(List<Integer> array) {
        List<Integer> newList = new ArrayList<>(array);
        Collections.reverse(newList);
        return newList;
    }
}
