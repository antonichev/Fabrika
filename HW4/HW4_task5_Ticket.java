package ua.od.fabrika.antonichev.HW4;

import java.util.Scanner;

/**
 * Ввести с клавиатуры шестизначный номер трамвайного (троллейбусного) билета,
 * и определить является ли он счастливым (совпадают суммы трёх первых и
 * трёх последних цифр билета).
 */
public class HW4_task5_Ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of ticket (6 digits):");
        int ticket = input.nextInt();

        if (ticket > 999999 || ticket < 100000){
            System.out.println("Error! Wrong data");
        }
        else {
            int num1 = ticket / 100000;
            int num2 = ticket / 10000; num2 %= 10;
            int num3 = ticket / 1000; num3 %=10;
            int num4 = ticket / 100; num4 %=10;
            int num5 = ticket / 10; num5 %=10;
            int num6 = ticket % 10;

            int firstPart = num1 + num2 + num3;
            int secondPart = num4 + num5 + num6;

            if (firstPart == secondPart){
                System.out.println("You've got a LUCKY ticket! You must eat it immediately!");
            }
            else {
                System.out.println("Not a lucky ticket... Sorry!");
            }
        }
    }
}
