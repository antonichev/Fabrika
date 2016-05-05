package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры размер одного фильма в гигабайтах
 * (вещественное значение!) и скорость Интернет-соединения в битах в секунду.
 * Определить, за какое время (часы, минуты и секунды) скачается фильм.
 */
public class HW3_task10_DownloadingTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of one movie (Gb):");
        double weight = input.nextDouble() * 1024 * 1024 * 1024;

        System.out.println("Enter width of your internet connection (bit/s):");
        int width = input.nextInt();

        if (weight <= 0 || width <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            int seconds = (int) Math.round(weight / width);

            int hours = seconds / 60 / 60;
            if (hours > 0) {
                seconds -= hours * 60 * 60;
            }

            int minutes = seconds / 60;
            if (minutes > 0) {
                seconds -= minutes * 60;
            }

            System.out.println("Total time for downloading: " + hours + ":" + minutes + ":" + seconds);
        }
    }
}
