package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Ввести с клавиатуры число и проверить, принадлежит
 * ли это число диапазону от N до M (включительно).
 */
public class HW2_task6_Range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter upper range: ");
        int upperRange = input.nextInt();

        System.out.println("Please enter lower range: ");
        int lowerRange = input.nextInt();

        if (lowerRange > upperRange){
            System.out.println("Wrong ranges. Swapping...");
            int a = lowerRange;
            lowerRange = upperRange;
            upperRange = a;

            System.out.println("Now upper range = " + upperRange + " and lower range = " + lowerRange);
        }

        System.out.println("Please enter number: ");
        int num = input.nextInt();

        if (num <= upperRange && num >= lowerRange){
            System.out.println(num + " belongs to range from " + upperRange + " to " + lowerRange);
        }
        else {
            System.out.println(num + " not belongs to range from " + upperRange + " to " + lowerRange);
        }
    }
}
