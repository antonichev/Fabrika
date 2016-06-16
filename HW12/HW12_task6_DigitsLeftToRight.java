package ua.od.fabrika.antonichev.HW12;

import java.util.Scanner;

/**
 * Цифры числа слева направо.
 * Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке,
 * разделяя их пробелами или новыми строками.
 * При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
 * Разрешена только рекурсия и целочисленная арифметика.
 * Ввод: 179
 * Вывод: 1 7 9
 */
public class HW12_task6_DigitsLeftToRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        if (number <= 0) System.out.println("Error! Wrong data");
        else {
            System.out.println(recursion(number));
        }
    }

    public static String recursion(int number) {
        if (number < 10) {
            return "" + number;
        }
        else {
            return recursion(number / 10) + " " + number % 10;
        }
    }
}
