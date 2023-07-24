package src.home_work.LEC16_collections_p1;

import java.util.ArrayList;
import java.util.LinkedList;

public class NumericLists {
    public static void createList() {
        LinkedList<Integer> tenNumbers = new LinkedList<>();

        int i;
        for (i = 0; i < 10; i++) {
            tenNumbers.add(i + 3);
        }
        long start = System.currentTimeMillis();
        System.out.println("Size=" + tenNumbers.size());
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        ArrayList<Integer> millionNumbers = new ArrayList<>();
        int j;
        for (j = 0; j < 2000000; j++) {
            millionNumbers.add(j + 3);
        }
        long startMillion = System.currentTimeMillis();
        System.out.println("Size=" + millionNumbers.size());
        long endMillion = System.currentTimeMillis();
        System.out.println(endMillion-startMillion);
    }

    public static void main(String[] args) {
        createList();
    }
}
