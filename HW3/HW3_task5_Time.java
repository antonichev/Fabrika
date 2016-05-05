package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры время в секундах.
 * Перевести это значение в дни, часы, минуты и секунды.
 * Например, 43512 секунд – это 12 часов, 5 минут и 12 секунд.
 */
public class HW3_task5_Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter time in seconds:");
        int time = input.nextInt();

        if (time <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            int days = time / 60 / 60 / 24;
            if (days > 0) {
                time -= days * 60 * 60 * 24;
            }

            int hours = time / 60 / 60;
            if (hours > 0) {
                time -= hours * 60 * 60;
            }

            int minutes = time / 60;
            if (minutes > 0) {
                time -= minutes * 60;
            }

            int seconds = time;

            System.out.println("It will be " + (days > 0 ? days + " days " : "")
                                             + (hours > 0 ? hours + " hrs " : "")
                                             + (minutes > 0 ? minutes + " min " : "")
                                             + seconds + " sec");
        }
    }
}
