package ua.od.fabrika.antonichev.HW4;

import java.util.Scanner;

/**
 * Программа подсчета идеального веса к росту.
 * Ввести рост и вес, вывести сообщение о том, сколько
 * нужно кг набрать или сбросить (идеальный вес = рост - 110).
 */
public class HW4_task8_PerfectWeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height (cm):");
        int height = input.nextInt();

        System.out.println("Enter your weight (kg):");
        int weight = input.nextInt();

        if ((height <= 0 && height > 300) || (weight <= 0 && weight > 300)){
            System.out.println("Error! Wrong data");
        }
        else {
            if (weight == height - 110){
                System.out.println("You've got perfect weight and height");
            }
            else {
                if (height - weight - 110 < 0){
                    System.out.println("For perfect you must reduce you weight by " + (Math.abs(height - weight - 110)) + " kg");
                }
                else {
                    System.out.println("For perfect you must increase you weight by " + (height - weight - 110) + " kg");
                }
            }
        }
    }
}
