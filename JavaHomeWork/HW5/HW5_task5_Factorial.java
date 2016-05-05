package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую факториал введённого числа.
 */
public class HW5_task5_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value:");
        int value = input.nextInt();

        if (value > 16 || value < -16){
            System.out.println("Error! Value too big");
        }
        else {
            int fact = (value == 0) ? 0 : 1;

            if (value > 0) {
                for (int i = 1; i <= value; i++) {
                    fact *= i;
                }
            } else {
                for (int i = -1; i >= value; i--) {
                    fact *= i;
                }
            }
            System.out.println(value + "! = " + fact);
        }
    }
}
