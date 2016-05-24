package ua.od.fabrika.antonichev.HW8;

import java.util.Scanner;

/**
 * Дано 3 числа. Написать функцию, которая вычисляет
 * сумму квадратов двух больших из этих трех чисел.
 */
public class HW8_task6_SumOfSquares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int first = input.nextInt();

        System.out.println("Enter second number:");
        int second = input.nextInt();

        System.out.println("Enter third number:");
        int third = input.nextInt();

        System.out.println("The sum of squares is " + sumOfSquaresNum(first, second, third));
    }

    public static int sumOfSquaresNum(int num1, int num2, int num3){
        int firstMax = maxNum(num1, num2);
        int secondMax = maxNum(num2, num3);

        System.out.println("First max: " + firstMax);
        System.out.println("Second max: " + secondMax);

        return firstMax * firstMax + secondMax * secondMax;
    }

    public static int maxNum(int num1, int num2){
        int max = num1;

        if (max < num2) max = num2;

        return max;
    }
}
