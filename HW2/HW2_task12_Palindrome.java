package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Ввести с клавиатуры пятизначное число и определить, является ли оно палиндромом
 *(т.е. одинаково читается в обоих направлениях -
 * например, 12321 будет палиндромом, а 12345 – не палиндром).
 */
public class HW2_task12_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 5-digit number: ");
        int number = input.nextInt();

        if (number >= 10000 && number < 100000){
            int firstPart = number / 1000;
            int secondPart = number % 100;

            int first = secondPart / 10;
            int second = secondPart % 10;

            secondPart = Integer.parseInt("" + second + first);

            if (firstPart == secondPart) System.out.println("This is a palindrome");
            else System.out.println("This is not a palindrome");
        }
        else {
            System.out.println("Error! (wrong number)");
        }
    }
}
