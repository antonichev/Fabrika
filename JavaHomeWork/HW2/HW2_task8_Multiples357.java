package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Ввести число и определить кратно ли
 * оно 3, 5, и 7 одновременно.
 */
public class HW2_task8_Multiples357 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int number = input.nextInt();

        if (number % 3 == 0){
            if (number % 5 == 0){
                if (number % 7 == 0){
                    System.out.println(number + " is multiples 3, 5 and 7");
                }
                else {
                    System.out.println(number + " is not multiples 7");
                }
            }
            else {
                System.out.println(number + " is not multiples 5");
            }
        }
        else {
            System.out.println(number + " is not multiples 3");
        }
    }
}
