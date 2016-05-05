package ua.od.fabrika.antonichev.HW4;

import java.util.Scanner;

/**
 * Вводится время (часы и минуты) – программа выводит приветствие,
 * соответствующее введённому времени (например, ввели 15 часов 6 минут –
 * выводится приветствие «добрый день»).
 */
public class HW4_task7_TimeOfTheDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current time (H):");
        int hours = input.nextInt();

        System.out.println("Enter current time (N):");
        int minutes = input.nextInt();

        if (hours < 0 || minutes < 0 || hours >= 24 || minutes >= 60){
            System.out.println("Error! Wrong data");
        }
        else {
            if (hours >= 0 && hours <= 12){
                System.out.println("Good morning!");
            }
            if (hours > 12 && hours <= 17){
                System.out.println("Good afternoon!");
            }
            if (hours > 17 && hours <= 22){
                System.out.println("Good evening!");
            }
            if (hours > 22 && hours <= 23){
                System.out.println("Good night!");
            }
        }
    }
}
