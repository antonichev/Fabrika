package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры время начала и время завершения
 * телефонного разговора (часы, минуты и секунды). Посчитать стоимость
 * разговора, если стоимость минуты составляет 15 копеек,
 * с учётом посекундной тарификации.
 */
public class HW3_task7_CostOfConversation {
    public static void main(String[] args) {
        double price = 0.15;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter time of star conversation (H):");
        int startHour = input.nextInt();

        System.out.println("Enter time of star conversation (M):");
        int startMinute = input.nextInt();

        System.out.println("Enter time of star conversation (S):");
        int startSecond = input.nextInt();

        System.out.println("Enter time of end conversation (H):");
        int endHour = input.nextInt();

        System.out.println("Enter time of end conversation (M):");
        int endMinute = input.nextInt();

        System.out.println("Enter time of end conversation (S):");
        int endSecond = input.nextInt();

        if (startHour <= 0 || startMinute <= 0 || startSecond <= 0 || endHour <= 0 || endMinute <= 0 || endSecond <=0 || startHour > endHour){
            System.out.println("Error! Wrong data");
        }
        else {
            int totalSecStart = startHour * 60 * 60 + startMinute * 60 + startSecond;
            int totalSecEnd = endHour * 60 * 60 + endMinute * 60 + endSecond;

            int diffSec = totalSecEnd - totalSecStart;

            double amount = (double) diffSec / 60 * price;

            System.out.println("Cost of your conversation is " + amount + " UAH");
        }
    }
}
