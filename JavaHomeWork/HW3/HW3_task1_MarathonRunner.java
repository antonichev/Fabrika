package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Марафонец прошел S километров со скоростью V метров в секунду
 * (расстояние и скорость вводятся с клавиатуры). Определить,
 * сколько времени он был в пути (часов, минут, секунд)?
 */
public class HW3_task1_MarathonRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter distance (km):");
        double distance = input.nextDouble();

        System.out.println("Enter speed (km/h):");
        double speed = input.nextDouble();

        if (distance <= 0 || speed <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            double timeInHours = distance / speed;

            int hours = 0, minutes = 0, seconds = 0;

            hours = (int) timeInHours;
            timeInHours -= hours;
            timeInHours *= 60;

            minutes = (int) timeInHours;
            timeInHours -= minutes;
            timeInHours *= 60;

            seconds = (int) timeInHours;

            System.out.println("Runner was in his way " + hours + " hrs, " + minutes + " min, " + seconds + " sec.");
        }
    }
}
