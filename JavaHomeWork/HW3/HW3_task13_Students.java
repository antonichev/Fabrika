package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Преподаватель вводит с клавиатуры количество студентов,
 * сдавших домашние задание, и количество «должников».
 * Посчитать, сколько процентов составляют «должники» от общего числа студентов.
 */
public class HW3_task13_Students {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity of students, that have no 'tails':");
        int good = input.nextInt();

        System.out.println("Enter quantity of students with 'tails':");
        int busy = input.nextInt();

        int totalStudents = good + busy;

        if (good < 0 || busy < 0 || totalStudents == 0){
            System.out.println("Error! Wrong data");
        }
        else {
            double percentGood = (double) good * 100 / totalStudents;
            double percentBusy = (double) busy * 100 / totalStudents;

            System.out.println("No 'tails': " + Math.round(percentGood) + "%; with 'tails': " + Math.round(percentBusy) + "%");
        }
    }
}
