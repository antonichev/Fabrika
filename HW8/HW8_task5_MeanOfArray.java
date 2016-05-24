package ua.od.fabrika.antonichev.HW8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дан массив из N целых чисел. Найти их среднее арифметическое.
 * Расчет среднего арифметического массива реализовать в виде функции.
 */
public class HW8_task5_MeanOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of array:");
        int length = input.nextInt();

        int[] myArray = new int[length];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int) (Math.random() * 10);
        }

        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Mean of array: " + meanOfArray(myArray));
    }


    public static int meanOfArray(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return sum / array.length;
    }
}
