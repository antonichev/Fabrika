package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Ввести число, и определить – чётное оно, или нет.
 */
public class HW2_task1_OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int num = input.nextInt();

        if (num == 0){
            System.out.println("You've entered 0");
        }

        else {
            if (num % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }
    }
}
