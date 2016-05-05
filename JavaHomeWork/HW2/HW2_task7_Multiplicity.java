package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Написать программу для проверки кратности
 * числа X числу Y (оба числа вводятся с клавиатуры).
 */
public class HW2_task7_Multiplicity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 'x': ");
        int x = input.nextInt();

        System.out.println("Please enter 'y': ");
        int y = input.nextInt();

        if (y % x == 0) {
            System.out.println("y is multiples x");
        }
        else {
            System.out.println("y is not multiples x");
        }
    }
}
