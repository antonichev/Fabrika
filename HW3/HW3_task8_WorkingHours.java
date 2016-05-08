package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры время в секундах,
 * прошедшее с начала рабочего дня. Посчитать, сколько
 * целых часов ему осталось сидеть на работе, если
 * рабочий день составляет 8 часов.
 */
public class HW3_task8_WorkingHours {
    public static void main(String[] args) {
        int totalHours = 8;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter time from working day starts in seconds:");
        int hours = input.nextInt() / 60 / 60;

        if (hours < 0 || hours > 8) System.out.println("Error! Wrong data");
        else System.out.println("You have to stay at office " + (totalHours - hours) + " hour(s)");
    }
}
