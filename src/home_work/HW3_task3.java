package src.home_work;

/*Якщо хтось справиться швидко то ось ще одне :
    Напишіть метод, який приймає два рядки - основний текст і слово для пошуку - і повертає кількість разів, коли слово з'являється в тексті.
    input :  {Try your skill, your},    {Try test in your test life, test }
    Output : 1, 2;
    в першому випадку слово your зустрічається 1 раз, в другому випадку слово test зустрічається 2 рази*/

public class HW3_task3 {
    public static int findByKeyword(String body, String keyword) {
        // check body and keyword for null and empty values
        if (body == null || keyword == null || body.isEmpty() || keyword.isEmpty()) {
            return 0;
        }

        int itemsFound = 0;
        String[] words = body.replaceAll("\\p{Punct}", "").split(" ");
        for (String item: words) {
            if (item.equals(keyword))
                itemsFound++;
        }
        return itemsFound;
    }
    public static void main(String[] args) {
        System.out.println(findByKeyword("Try your skill", "your"));
        System.out.println(findByKeyword("Try your skill", null)); // additional case with null keyword

        System.out.println(findByKeyword("Try test in your test life", "test"));
        System.out.println(findByKeyword("", "test")); //additional case with empty body


    }
}
