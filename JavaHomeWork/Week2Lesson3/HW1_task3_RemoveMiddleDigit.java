package ua.od.fabrika.antonichev.HW1;

/**
* Ввести с клавиатуры 3-значное число и удалить из него среднюю цифру
* (например, ввести 3, 5, 7 – получить и вывести число 37).
*/

import java.util.Scanner;

public class HW1_task3_RemoveMiddleDigit {
    public static void main(String[] args) {
        int first, middle, last;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3-digit number: ");
        int num = input.nextInt();

        if (num > 999 || num < 100){
            System.out.println("Error! (wrong number)");
            return;
        }

        first = num / 100;
        last = num % 10;

        System.out.println("Result: " + first + last);
    }
}
