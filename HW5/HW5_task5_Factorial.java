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

        if (value > 16 || value < 0){
            System.out.println("Error! Value either too big or less 0");
        }
        else {
            int fact = (value == 0) ? 0 : 1;

            for (int i = 1; i <= value; i++) {
                fact *= i;
            }
            System.out.println(value + "! = " + fact);
        }
    }
}
