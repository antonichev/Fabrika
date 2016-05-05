package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры расстояние до аэропорта
 * (в километрах, может быть вещественное значение) и время,
 * за которое нужно доехать (в минутах).
 * Вычислить скорость (км/ч), с которой нужно ехать.
 */
public class HW3_task6_Speed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter distance to airport in km:");
        double distance = input.nextDouble();

        System.out.println("Enter time in minutes:");
        double time = (double) input.nextInt() / 60;

        if (distance <= 0 || time <= 0) System.out.println("Error! Wrong data");
        else System.out.println("You must drive to airport with speed " + (int) distance / time + " km/h");
    }
}
