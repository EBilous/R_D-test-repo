package src.home_work;

/*Напишіть програму, яка розраховує потенцію числа, використовуючи цикл for.
    Наприклад, якщо база - 2, а показник степеня - 3, програма має вивести: 2 * 2 * 2 = 8.*/

public class potential_of_number {
    public static void main(String[] args) {
        int base =2;
        int step =3;
        int result = 1;
        for (int i = 1; i<=step; i++){
            result = base * result;
        }
        System.out.println(result);
    }
}