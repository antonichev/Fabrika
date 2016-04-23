package ua.od.fabrika.antonichev.HW1;

/**
 * Ввести пятизначное число и сдвинуть его циклически вправо на 2 разряда
 * (например, если число равно 12345 – вывести на экран 45123).
 */

import java.util.Scanner;

public class HW1_task9_CircularShift {
    public static void main(String[] args) {
        int first, second, third, forth, fifth;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter five-digit number: ");
        int num = input.nextInt();

        if (num > 99999 || num < 10000){
            System.out.println("Error! (number is wrong)");
        }
        else {
            first = num / 10000; first %= 1000;
            second = num / 1000; second %= 100; second %= 10;
            third = num / 100; third %= 10;
            forth = num / 10; forth %= 10;
            fifth = num % 10;

            System.out.println("Result: " + forth + fifth + first + second + third);
        }
    }
}
