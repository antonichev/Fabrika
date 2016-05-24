package ua.od.fabrika.antonichev.HW8;

import java.util.Scanner;

/**
 * Написать функцию, которая принимает три аргумета типа int.
 * Метод должен посчитать наименьший из них и вернуть в качестве результата.
 */
public class HW8_task2_LeastNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int first = input.nextInt();

        System.out.println("Enter second number:");
        int second = input.nextInt();

        System.out.println("Enter third number:");
        int third = input.nextInt();

        System.out.println("The least number is " + leastNum(first, second, third));
    }

    public static int leastNum(int num1, int num2, int num3){
        int least = num1;

        if (least > num2) least = num2;
        if (least > num3) least = num3;

        return least;
    }
}
