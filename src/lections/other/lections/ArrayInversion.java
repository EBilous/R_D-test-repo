package src.lections.other.lections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayInversion {
    public static void main(String[] args) {
        List<Integer> objectArr = List.of(1, 2, 3, 4, 5);
        System.out.println(reverse(objectArr));
    }


    public static Collection<Integer> reverse(List<Integer> array) {
            List<Integer> newList = new ArrayList<>(array);
            Collections.reverse(newList);
            return newList;
        }

}
