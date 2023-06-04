package src.home_work;

import org.jetbrains.annotations.NotNull;


/*Якщо хтось справиться швидко то ось ще одне :
    Напишіть метод, який приймає два рядки - основний текст і слово для пошуку - і повертає кількість разів, коли слово з'являється в тексті.
    input :  {Try your skill, your},    {Try test in your test life, test }
    Output : 1, 2;
    в першому випадку слово your зустрічається 1 раз, в другому випадку слово test зустрічається 2 рази*/
public class HW3_task3 {
    public static int myMethod(@NotNull String body, @NotNull String keyword){
        int itemsFound = 0;
        String[] words = body.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");
        for (String i: words) {
            if (i.equals(keyword))
                itemsFound++;
        }
        return itemsFound;
    }
    public static void main(String[] args) {
        System.out.println(myMethod("Try your skill", "your"));
        System.out.println(myMethod("Try test in your test life", "test"));
    }
}
