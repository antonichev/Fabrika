package ua.od.fabrika.antonichev.HW1;

import java.util.Scanner;

/**
 * Написать программу, которая переводит фунты в килограммы. Один фунт – 405.9 грамма
 * задается в программе как константа. Затем, реализовать обратный перевод – из килограммов в фунты.
 */
public class HW1_task6_WeightConverter {
    public static void main(String[] args) {
        double pound = 0.4059;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight: ");

        int weight = input.nextInt();

        System.out.println("Please enter your choice:");
        System.out.println("1. Kilograms to pound converter");
        System.out.println("2. Pound to Kilograms converter");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println(weight + " kg = " + weight /  pound + " lbs");
                break;
            case 2:
                System.out.println(weight + " lbs = " + weight * pound + " kg");
                break;
            default:
                System.out.println("You entered wrong choice!");
                break;
        }
    }
}
