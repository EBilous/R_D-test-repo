package src.home_work.LEC15_generics;

/*Завдання: Параметризований клас Pair

Створіть параметризований клас Pair, який приймає два параметри типу.
Клас повинен мати методи getFirst() та getSecond(), які повертають перший та другий елементи відповідно.
Протестуйте клас Pair, створюючи об'єкти з різними типами даних (наприклад, цілі числа, рядки, об'єкти) та отримуючи їх значення.*/

public class Pair<F, S> {

    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void showInfo() {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("One", 2);
        pair.showInfo();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println();

        byte x = 10;
        Pair<Boolean, Byte> pair1 = new Pair<>(true, x);
        pair1.showInfo();
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        // Just test
        System.out.println("Is second a Byte type?: " + (pair1.second instanceof Byte));
    }


}
