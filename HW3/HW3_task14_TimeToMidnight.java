package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры время в секундах, прошедшее с начала дня.
 * Определить, сколько времени (часов, минут и секунд) осталось до полуночи.
 */
public class HW3_task14_TimeToMidnight {
    public static void main(String[] args) {
        int totalSeconds = 24 * 60 * 60;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter time from day starts in seconds:");
        int seconds = input.nextInt();

        if (seconds <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            if (seconds > totalSeconds) {
                System.out.println("Value is too big");
            } else {
                if (seconds == totalSeconds) {
                    System.out.println("It's midnight");
                } else {
                    int diff = totalSeconds - seconds;

                    int hours = diff / 60 / 60;
                    if (hours > 0) {
                        diff -= hours * 60 * 60;
                    }

                    int minutes = diff / 60;
                    if (minutes > 0) {
                        diff -= minutes * 60;
                    }

                    System.out.println("To midnight left " + hours + ":" + minutes + ":" + diff);
                }
            }
        }
    }
}
