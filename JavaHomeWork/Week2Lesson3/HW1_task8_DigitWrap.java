package ua.od.fabrika.antonichev.HW1;

import java.util.Scanner;

/**
* Ввести с клавиатуры 3-значное число и «перевернуть» его (например, ввести 357 – получить и вывести 753).
*/
public class HW1_task8_DigitWrap {
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
        middle = num / 10; middle %= 10;
        last = num % 10;

        System.out.println("Result: " + last + middle + first);
    }
}
