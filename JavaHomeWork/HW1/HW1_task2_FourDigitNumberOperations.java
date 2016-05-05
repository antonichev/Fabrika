package ua.od.fabrika.antonichev.HW1;

import java.util.Scanner;

/**
*  Ввести 4-значное число и подсчитать сумму первой и третьей цифры и
*  разность второй и четвертой цифры.
*/
public class HW1_task2_FourDigitNumberOperations {
    public static void main(String[] args) {
        int first, second, third, fourth;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 4-digit number: ");
        int num = input.nextInt();

        if (num > 9999 || num < 1000){
            System.out.println("Error! (number is wrong)");
            return;
        }

        first = num / 1000;
        second = num / 100; second %= 10;
        third = num / 10; third %= 10;
        fourth = num % 10;

        System.out.println("Result: first + third digit = " + (first + third) + ", second - fourths digit = " + (second - fourth));
    }
}
