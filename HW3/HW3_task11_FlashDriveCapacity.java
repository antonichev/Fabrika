package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры объем флешки в гигабайтах.
 * Посчитать, сколько на нее поместится фильмов размером 760 Мбайт.
 */
public class HW3_task11_FlashDriveCapacity {
    public static void main(String[] args) {
        int oneMovie = 750;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter capacity of flash drive (Gb):");
        int capacity = input.nextInt() * 1024;

        if (capacity <= 0) System.out.println("Error! Wrong data");
        else System.out.println("You can put " + capacity / oneMovie + " movie(s) onto your flash drive");
    }
}
