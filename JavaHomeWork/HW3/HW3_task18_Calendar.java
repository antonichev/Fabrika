package ua.od.fabrika.antonichev.HW3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Какая дата будет через N дней?
 * Рекомендуется использование типа GregorianCalendar.
 */
public class HW3_task18_Calendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity of days:");
        int days = input.nextInt();

        if (days > 0) {
            Calendar calendar = new GregorianCalendar();

            calendar.add(Calendar.DATE, days);

            System.out.println(days + " days later: " + calendar.getTime());
        }
        else {
            System.out.println("Error! wrong data");
        }
    }
}
