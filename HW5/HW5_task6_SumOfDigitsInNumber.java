package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * С клавиатуры вводится целое число любой разрядности.
 * Определить количество цифр в нём и их сумму.
 */
public class HW5_task6_SumOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        int sum = 0;

        if (number == 0) System.out.println("Quantity of digits: 1, sum: 0");
        else {
            int qty = 0;
            while (number != 0){
                qty++;
                sum += number % 10;
                number /= 10;
            }
            System.out.println("Quantity of digits: " + qty + ", sum: " + Math.abs(sum));
        }
    }
}
