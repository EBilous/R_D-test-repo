package src.home_work.LEC17.collections.LEC19.maps;

import java.util.HashMap;

public class UkrainianTranslations {
    public static HashMap<String, String[]> vocabulary() {

        HashMap<String, String[]> ukrainianTranslations = new HashMap<>();

        ukrainianTranslations.put("привіт", new String[]{"hello", "こんにちは", "hallo"});
        ukrainianTranslations.put("дякую", new String[]{"thank you", "ありがとう", "danke"});
        ukrainianTranslations.put("будь ласка", new String[]{"please", "お願いします", "bitte"});
        ukrainianTranslations.put("кохання", new String[]{"love", "愛", "liebe"});
        ukrainianTranslations.put("добре", new String[]{"good", "良い", "gut"});
        ukrainianTranslations.put("робота", new String[]{"work", "仕事", "Arbeit"});
        ukrainianTranslations.put("школа", new String[]{"school", "学校", "Schule"});
        ukrainianTranslations.put("сонце", new String[]{"sun", "太陽", "Sonne"});
        ukrainianTranslations.put("вода", new String[]{"water", "水", "Wasser"});
        ukrainianTranslations.put("мир", new String[]{"peace", "平和", "Frieden"});

        return ukrainianTranslations;

    }

    public static void getTranslation(String word) {
        String[] translations = UkrainianTranslations.vocabulary().get(word);
        if (word != null && translations != null) {
            try {
                System.out.println("Ukrainian: " + word);
                System.out.println("English: " + translations[0]);
                System.out.println("Japanese: " + translations[1]);
                System.out.println("German: " + translations[2]);
                System.out.println();
            }
            catch (Exception e) {
                System.out.println("Sorry. There are no translations for this word.");
            }
            }
        else System.out.println("Sorry. There are no translations for this word.");
        }
    }
