package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры два дробных числа.
 * Вывести на экран сумму целых частей и сумму дробных.
 */
public class HW3_task2_SummOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first decimal: ");
        double first = input.nextDouble();

        System.out.println("Enter second decimal: ");
        double second = input.nextDouble();

        int firstInt = (int) first;
        int secondInt = (int) second;

        System.out.println("Sum of integers is " + (firstInt + secondInt));

        first -= firstInt;
        second -= secondInt;

        System.out.println("Sum of decimals is " + (first + second));
    }
}
