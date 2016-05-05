package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * Программа печатает таблицу соответствия температур по
 * Цельсию и Фаренгейту  в указанном диапазоне.
 */
public class HW5_task4_CandF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter start value:");
        int start = input.nextInt();

        System.out.println("Enter end value:");
        int end = input.nextInt();

        if (end < start || end == start){
            System.out.println("Error! Wrong data");
        }
        else {
            for (int i = start; i <= end; i++) {
                System.out.println(i + "\u00b0C = " + (double) Math.round((i * 1.8 + 32) * 10) / 10 + "\u00b0F");;
            }
        }
    }
}
