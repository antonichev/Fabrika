package ua.od.fabrika.antonichev.HW8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дан массив из N целых чисел. Найти их сумму.
 * Расчет суммы массива реализовать в виде функции.
 */
public class HW8_task3_SumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of array:");
        int length = input.nextInt();

        int[] myArray = new int[length];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int) (Math.random() * 10);
        }

        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Sum of array: " + sumOfArray(myArray));
    }


    public static int sumOfArray(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return sum;
    }
}
