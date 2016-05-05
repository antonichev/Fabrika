package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * Проверить, есть ли во введённом числе
 * одинаковые цифры подряд.
 */
public class HW5_task10_SameDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        String digit = "";
        String repDigit = "";

        while (number != 0){
            if (digit.equals("" + number % 10)) repDigit += " " + Math.abs(number) % 10;
            digit = "" + number % 10;
            number /= 10;
        }

        System.out.println("Repeating number(s):" + repDigit);
    }
}
