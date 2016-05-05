package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Ввести число, и выяснить - положительное оно,
 * отрицательное, или равно нулю?
 */
public class HW2_task3_PosNegOrZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int num = input.nextInt();

        if (num == 0){
            System.out.println("Number is 0");
        }
        else {
            if (num < 0){
                System.out.println("Number is negative");
            }
            else {
                System.out.println("Number is positive");
            }
        }
    }
}
