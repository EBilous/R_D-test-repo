package src.home_work.LEC18.sets;

/*1. У циклі на 1000 повтореннь сгенерувати випадкові числі діапазоном від 1 до 50 за зберегти їх у різні типи колекцій сет

2. Вивести всі 3 варіанти на консоль*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        int min = 1;
        int max = 50;

        System.out.println(randomIntHashSet(min, max));
        System.out.println(randomIntTreeSet(min, max));
        System.out.println(randomIntLinkedHashSet(min, max));
        }


    private static HashSet<Integer> randomIntHashSet(int min, int max) {

        Random random = new Random();

        HashSet<Integer> newHashSet = new HashSet<>();

        for (int i = 0; i < 1000; i++) {
            newHashSet.add(random.nextInt(max - min) + min);
        }
        return newHashSet;
    }

    private static TreeSet<Integer> randomIntTreeSet(int min, int max) {

        Random random = new Random();

        TreeSet<Integer> newTreeSet = new TreeSet<>();

        for (int i = 0; i < 1000; i++) {
            newTreeSet.add(random.ints(min, max).findFirst().getAsInt());
        }
        return newTreeSet;
    }

    private static LinkedHashSet<Integer> randomIntLinkedHashSet(int min, int max) {

        Random random = new Random();

        LinkedHashSet<Integer> newLinkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < 1000; i++) {
            newLinkedHashSet.add(random.nextInt(max - min) + min);
        }
        return newLinkedHashSet;
    }
}
