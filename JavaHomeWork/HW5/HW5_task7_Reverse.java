package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * С клавиатуры вводится целое число любой разрядности.
 * Необходимо перевернуть это число, т.е.  цифры должны располагаться
 * в обратном порядке (например, вводим число 1234 – в результате будет 4321).
 */
public class HW5_task7_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        String newNum = "";

        if (number == 0) System.out.println("0");

        if (number < 0){
            number *= -1;
            while (number != 0) {
                newNum += number % 10;
                number /= 10;
            }
            System.out.println("-" + newNum);
        }
        else {
            while (number != 0) {
                newNum += number % 10;
                number /= 10;
            }
            System.out.println(newNum);
        }
    }
}
