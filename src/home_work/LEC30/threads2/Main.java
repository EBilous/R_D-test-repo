package src.home_work.LEC30.threads2;

/*Створити поток який генерує числа від 1 до 10 і нескінченно їх виводить на консоль. Якщо згенероване число == 5 - то перервати роботу потоку

Створити callable поток, який повертає випадково згенероване число від 1 до 50. Зробити пул с 10 потоків для виклику цього методу*/

public class Main {
    public static void main(String[] args) {
        Thread valuePrinterThread = new Thread(new ValuePrinter());
        valuePrinterThread.start();
    }
}
