package ua.od.fabrika.antonichev.HW4;

import java.util.Scanner;

/**
 * Проверить, имеет ли введённое число вещественную часть.
 * Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5 и 10.0 – нет.
 */
public class HW4_task2_RealNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        double number = input.nextDouble();

        int checkNum = (int) number;

        if (number % checkNum > 0){
            System.out.println("Number has a real part");
        }
        else {
            System.out.println("Number doesn't has a real part");
        }
    }
}
