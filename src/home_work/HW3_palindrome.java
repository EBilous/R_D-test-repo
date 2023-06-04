package src.home_work;

import java.util.List;

public class HW3_palindrome {
    static boolean isStrPalindrome(String str)
        {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }


    public static void main(String[] args) {
        List<String> list1 = List.of("Study", "Spring", "Java", "ADA");
        for (String s : list1) {
                System.out.println(isStrPalindrome(s));
            }
    }
}
