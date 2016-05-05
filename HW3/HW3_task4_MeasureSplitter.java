package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры массу в тоннах (дробное число).
 * Вывести по отдельности количество тонн, килограмм, грамм
 * (например, ввести 126.456789т - получить и вывести 126т 456кг 789г)
 */
public class HW3_task4_MeasureSplitter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight (t):");
        double weight = input.nextDouble();

        if (weight <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            int t = (int) weight;

            weight -= t;
            weight *= 1000;

            int kg = (int) weight;

            weight -= kg;
            weight *= 1000;

            int g = (int) weight;

            System.out.println("It will be " + t + "t " + kg + "kg " + g + "g.");
        }
    }
}
