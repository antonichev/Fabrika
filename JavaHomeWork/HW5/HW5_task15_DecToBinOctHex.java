package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * Написать программу, позволяющую переводить любое число из
 * десятичной системы счисления в 2, 8 и 16-ричную систему.
 */
public class HW5_task15_DecToBinOctHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        if (number <= 0) System.out.println("Error! Wrong data");

        else {
            System.out.println("1. DEC to BIN");
            System.out.println("2. DEC to OCT");
            System.out.println("3. DEC to HEX");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result 1 = " + Integer.toBinaryString(number));
                    System.out.println("Result 2 = " + dec2bin(number));
                    break;
                case 2:
                    System.out.println("Result 1 = " + Integer.toOctalString(number));
                    System.out.println("Result 2 = " + dec2oct(number));
                    break;
                case 3:
                    System.out.println("Result 1 = " + Integer.toHexString(number));
                    System.out.println("Result 2 = " + dec2hex(number));
                    break;
                default:
                    System.out.println("Incorrect choice!");
                    break;
            }
        }
    }
    public static String dec2bin(int number){
        String result = "";

        while (number != 0) {
            result += number % 2;
            number /= 2;
        }

        StringBuffer sb = new StringBuffer(result);
        String reverse  = sb.reverse().toString();

        return reverse;
    }
    public static String dec2oct(int number){
        String result = "";

        int num = number;

        while (number != 0) {
            num /= 8;
            result += number - num * 8;;
            number = num;
        }

        StringBuffer sb = new StringBuffer(result);
        String reverse  = sb.reverse().toString();

        return reverse;
    }
    public static String dec2hex(int number){
        String result = "";

        int num = number;

        while (number != 0) {
            num /= 16;

            String res = "";

            if (number - num * 16 == 10){
                res = "A";
            }
            if (number - num * 16 == 11){
                res = "B";
            }
            if (number - num * 16 == 12){
                res = "C";
            }
            if (number - num * 16 == 13){
                res = "D";
            }
            if (number - num * 16 == 14){
                res = "E";
            }
            if (number - num * 16 == 15){
                res = "F";
            }
            if (number - num * 16 < 10){
                res = "" + (number - num * 16);
            }
            result += res;;
            number = num;
        }

        StringBuffer sb = new StringBuffer(result);
        String reverse  = sb.reverse().toString();

        return reverse;
    }
}
