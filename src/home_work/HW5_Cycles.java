package src.home_work;

    // Створити програму для виведення чисел від 1 до 10

    // Показати всі парні числа в діапазоні від 1 до 100

    // Знайти факторіал числа 7

    // Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)

public class HW5_Cycles {
    public static void main(String[] args) {
        ranger(10);
        even_numbers(100);
        factorial(7);
        fibonacci(100);

    }

    // 10 is not included to the output
    public static void ranger(Integer range_limit){
        System.out.printf("Range from 1 to %s" + "%n", range_limit);
        for (int start = 1; start < range_limit; start++){
            System.out.println(start);
        }
    }

    // 100 was included :)
    public static void even_numbers(int limit) {
        System.out.printf("Even numbers from 1 to %s" + "%n", limit);
        for (int item = 1; item <= limit; item++) {
            if (item % 2 == 0) {
                System.out.println(item);
            }
        }
    }

    public static void factorial(int number) {
        System.out.printf("Factorial of %s" + "%n", number);
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void fibonacci(int lim) {
        System.out.printf("Fibonacci series up to %s" + "%n", lim);
        int number1 =0;
        int number2 =1;
        int result =0;
        while (result<=lim){
             result = number1+number2;
            number1=number2;
            number2=result;
            if (result<=lim)
                System.out.println(result);
        }
    }
}
