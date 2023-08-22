package src.lections.LEC20;

import java.util.LinkedHashMap;
import java.util.Map;

/* 2 LinkedHashMap (removeEldestEntry)
        Створіть простий кеш для зберігання String значень з ключами типу Integer.
        Кеш повинен містити не більше 10 елементів. Якщо кількість елементів в кеші перевищує 10,
        програма повинна автоматично видаляти найстаріший елемент.*/

public class ThirdTask {

    public static final int MAX_SIZE = 10;

    private LinkedHashMap map = new LinkedHashMap(MAX_SIZE){
        @Override protected boolean removeEldestEntry(Map.Entry eldest) {
            return size()>MAX_SIZE;
        }
    };



    public void put(int key, String value) {
        map.put(key, value);
    }

    private String test;

}
