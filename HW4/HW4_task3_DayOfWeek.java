package ua.od.fabrika.antonichev.HW4;

import java.util.Scanner;

/**
 * Написать программу, которая предлагает пользователю ввести номер дня недели,
 * и в ответ показывает название этого дня (например, 6 – это суббота).
 * Решить с использованием if и switch.
 */
public class HW4_task3_DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of a day:");
        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}
