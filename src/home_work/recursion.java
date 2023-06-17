package src.home_work;

public class recursion {
    public static void main(String[] args) {
    recursively("Eugene");
    }

    public static StringBuilder recursively(String input) {
        StringBuilder name = new StringBuilder(input);
        System.out.println(name);
        if (!name.isEmpty()) {
            recursively(String.valueOf(name.deleteCharAt(name.length()-1)));
        }
        return name;
    }
    }
