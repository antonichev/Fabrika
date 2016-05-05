package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Показать модуль введённого числа.
 * (Не используя Math.abs)
 */
public class HW2_task10_Abs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int num = input.nextInt();

        if (num >= 0){
            System.out.println("Result: " + num);
        }
        else {
            System.out.println("Result: " + (-1 * num));
            }
       }
}
