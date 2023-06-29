package src.home_work;

import java.util.List;

public class HW3_Palindrome {
    static boolean isStrPalindrome(String wordToCheck) {
            int i = 0, j = wordToCheck.length() - 1;
            while (i < j) {
                if (wordToCheck.charAt(i) != wordToCheck.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }


    public static void main(String[] args) {
        List<String> listOfWords = List.of("Study", "Spring", "Java", "ADA");
        listOfWords.forEach(word -> System.out.println(isStrPalindrome(word)));
    }
}
