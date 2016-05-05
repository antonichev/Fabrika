package ua.od.fabrika.antonichev.HW4;

import java.util.Scanner;

/**
 * Указать с клавиатуры пол и возраст человека.
 * Определить, пора ли ему на пенсию.
 */
public class HW4_task6_Retirement {
    public static void main(String[] args) {
        int maleRetAge = 60;
        int femaleRetAge = 55;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age of person:");
        int age = input.nextInt();

        if (age < 0){
            System.out.println("Person doesn't born yet");
        }
        else {
            if (age < 55){
                System.out.println("Person don't achieve retirement age");
            }
            else {
                System.out.println("Enter gender of person: '1' for male, '2' for female");
                int gen = input.nextInt();

                if (gen != 1 && gen != 2){
                    System.out.println("Error! Incorrect choice");
                }
                else {
                    switch (gen){
                        case 1:
                            if (age < maleRetAge){
                                System.out.println("Person don't achieve retirement age");
                            }
                            else {
                                System.out.println("It is time for retirement");
                            }
                            break;
                        case 2:
                            if (age < femaleRetAge){
                                System.out.println("Person don't achieve retirement age");
                            }
                            else {
                                System.out.println("It is time for retirement");
                            }
                            break;
                    }
                }
            }
        }
    }
}
