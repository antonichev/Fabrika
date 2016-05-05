package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Вводится целое число (не более 4 разрядов!).
 * Определить количество цифр в нём.
 */
public class HW2_task11_QtyOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number (not more than 4 digits): ");
        int number = input.nextInt();

        if (number > 9999){
            System.out.println("Error! (wrong number)");
        }
        else {
            //first variant
            String s = "" + number;
            System.out.println("Quantity of digits is " + s.length());

            //second variant
            if (number == 0){
                System.out.println("Quantity of digits is 1");
            }
            else{
                if (number * 10 > 9999){
                    System.out.println("Quantity of digits is 4");
                }
                else {
                    if (number * 100 > 9999){
                        System.out.println("Quantity of digits is 3");
                    }
                    else {
                        if (number * 1000 > 9999){
                            System.out.println("Quantity of digits is 2");
                        }
                        else {
                            System.out.println("Quantity of digits is 1");
                        }
                    }
                }
            }
        }
    }
}
