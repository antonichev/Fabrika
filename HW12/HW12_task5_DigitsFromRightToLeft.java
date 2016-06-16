package ua.od.fabrika.antonichev.HW12;

import java.util.Scanner;

/**
 * Цифры числа справа налево.
 * Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами.
 * При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
 * Разрешена только рекурсия и целочисленная арифметика.
 */
public class HW12_task5_DigitsFromRightToLeft {
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
        if (number < 10) {
            return number;
        }
        else {
            System.out.print(number % 10 + " ");
            return recursion(number / 10);
        }
    }
}
