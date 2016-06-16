package ua.od.fabrika.antonichev.HW12;

import java.util.Scanner;

/**
 * Разворот числа.
 * Дано число n, десятичная запись которого не содержит нулей.
 * Получите число, записанное теми же цифрами, но в противоположном порядке.
 * При решении этой задачи нельзя использовать циклы, строки, списки, массивы,
 * разрешается только рекурсия и целочисленная арифметика.
 * Метод должен возвращать целое число, являющееся результатом работы программы,
 * выводить число по одной цифре нельзя.
 * Ввод: 179
 * Вывод: 971
 */
public class HW12_task7_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        if (number <= 0) System.out.println("Error! Wrong data");
        else {
            System.out.println(recursion(number, 0));
        }
    }

    public static int recursion(int number, int newNumber){
        if (number == 0) {
            return newNumber / 10;
        }
        else {
            newNumber += number % 10;
            newNumber *= 10;
            return  recursion(number / 10, newNumber);
        }
    }
}
