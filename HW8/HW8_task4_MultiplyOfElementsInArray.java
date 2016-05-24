package ua.od.fabrika.antonichev.HW8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дан массив из N целых чисел. Найти их произведение.
 * Расчет произведения массива реализовать в виде функции.
 */
public class HW8_task4_MultiplyOfElementsInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of array:");
        int length = input.nextInt();

        int[] myArray = new int[length];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int) (Math.random() * 10);
        }

        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Multiply of elements in array: " + multiplyOfArray(myArray));
    }


    public static int multiplyOfArray(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            sum *= array[i];
        }

        return sum;
    }
}
