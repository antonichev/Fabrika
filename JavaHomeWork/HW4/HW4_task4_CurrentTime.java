package ua.od.fabrika.antonichev.HW4;

import java.util.Scanner;

/**
 * Указать с клавиатуры текущее время (количество часов, минут, секунд).
 * Проверить корректность введённых значений.
 */
public class HW4_task4_CurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current time (hours):");
        int hour = input.nextInt();

        System.out.println("Enter current time (minutes):");
        int minute = input.nextInt();

        System.out.println("Enter current time (seconds):");
        int second = input.nextInt();

        if (hour > 23 || hour < 0){
            System.out.println("Error! Incorrect hours");
        }
        else {
            if (minute > 59 || minute < 0) {
                System.out.println("Error! Incorrect minutes");
            }
            else {
                if (second > 59 || second < 0) {
                    System.out.println("Error! Incorrect seconds");
                }
                else System.out.println("Time is correct");
            }
        }


    }
}
