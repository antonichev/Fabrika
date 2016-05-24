package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать программу, которая предлагает пользователю
 * ввести число, и затем подсчитывает, сколько раз это
 * число встречается в массиве на 100 случайных элементов.
 */
public class HW6_task5_QuantityOfValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value:");
        int value = input.nextInt();

        int count = 0;

        if (value < 0){
            System.out.println("Error! Wrong data");
        }
        else {
            int[] myArray = new int[100];

            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = (int) (Math.random() * 100);
            }

            for (int i = 0; i < myArray.length; i++){
                if (myArray[i] == value){
                    count++;
                }
            }

            System.out.println("Array: " + Arrays.toString(myArray));
            System.out.println((count > 0) ? count + " match(es)" : "No matches, sorry.");
        }
    }
}
