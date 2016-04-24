package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Ввести три числа и найти наименьшее среди них.
 */
public class HW2_task2_LeastFromThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num_1 = input.nextInt();

        System.out.println("Please enter second number: ");
        int num_2 = input.nextInt();

        System.out.println("Please enter third number: ");
        int num_3 = input.nextInt();

        if (num_1 == num_2 && num_2 == num_3){
            System.out.println("You've entered equal numbers");
            return;
        }

        if (num_1 < num_2){
            if (num_1 < num_3){
                System.out.println("The least number is " + num_1);
            }
            else{
                System.out.println("The least number is " + num_3);
            }
        }
        else {
            if (num_2 < num_3){
                System.out.println("The least number is " + num_2);
            }
            else {
                System.out.println("The least number is " + num_3);
            }
        }
    }
}
