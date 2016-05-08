package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * С клавиатуры вводится целое число. Определить, является ли оно простым.
 * Простое число делится без остатка только на 1 и само на себя.
 */
public class HW5_task9_SimpleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        if (number == 0) System.out.println("Error! Wrong number");

        else {
            int count = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;

                    if (count > 2) {
                        System.out.println("Number is not simple");
                        break;
                    }
                }
            }
            if (count <= 2) System.out.println("Number is simple");
        }
    }
}
