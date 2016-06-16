package ua.od.fabrika.antonichev.HW12;

import java.util.Scanner;

/**
 * Сумма цифр числа.
 * Дано натуральное число N. Вычислите сумму его цифр.
 * При решении этой задачи нельзя использовать строки, списки, массивы, переменные класса (ну и циклы, разумеется).
 * Ввод: 179
 * Вывод: 17
 */
public class HW12_task4_SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        if (number <= 0) System.out.println("Error! Wrong data");
        else {
            System.out.println(recursion(number));
        }
    }

    public static int recursion(int number) {
        if (number < 10) return number;
        else return number % 10 + recursion(number / 10);
    }
}
