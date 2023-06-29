package src.home_work;

/*Створити програму для обробки символьних рядків:

    Створити зміну типу String

    Показати цю зміну у верхньому та нижньому регістрах

    Показати першу та останню літери*/


import java.util.Scanner;

public class HW3_Strings {

    //task1
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write some text: ");
        String text = scanner.nextLine();

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length()-1));
    }
}
