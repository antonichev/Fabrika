package ua.od.fabrika.antonichev.HW1;

import java.util.Scanner;

/**
 * Поменять местами значения переменных a и b, сначала с использованием
 * дополнительной третьей переменной, а затем – без.
 */
public class HW1_task11_VariablesSwap {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 'a' variable: ");
        a = input.nextInt();

        System.out.println("Please enter 'b' variable: ");
        b = input.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("1. Using additional variable. Now 'a' = " + a + " and 'b' = " + b);

        a -= b;
        b = a + b;
        a = b - a;

        System.out.println("2. Without additional variable (arithmetic). Now 'a' = " + a + " and 'b' = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("3. Without additional variable (XOR). Now 'a' = " + a + " and 'b' = " + b);

        System.out.println("4. Using cheat. Now 'a' = " + b + " and 'b' = " + a);

    }
}
