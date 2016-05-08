package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * С клавиатуры вводится целое число. Вывести на экран все числа,
 * на которые введённое число делится без остатка. Например,
 * для 60 такими числами станут 1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60.
 */
public class HW5_task8_Dividers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        for (int i = 1; i <= number / 2 + 1; i++){
            if (number % i == 0){
                System.out.println(i);
            }
        }
        System.out.println(number);
    }
}
