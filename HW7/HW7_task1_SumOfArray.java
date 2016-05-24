package ua.od.fabrika.antonichev.HW7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дан двумерный массив размерностью M х N, заполненный случайными числами из диапазона от 0 до 20.
 * Определить сумму элементов массива, среднее арифметическое, минимальный и максимальный элемент.
 */
public class HW7_task1_SumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter M-array size:");
        int mSize = input.nextInt();

        System.out.println("Enter N-array size:");
        int nSize = input.nextInt();

        if (mSize <= 0 || nSize <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            int[][] myArray = new int[mSize][nSize];

            for (int m = 0; m < mSize; m++) {
                for (int n = 0; n < nSize; n++) {
                    myArray[m][n] = (int) (Math.random() * 20);
                }
            }

            int min = myArray[0][0], max = myArray[0][0], sum = 0;

            for (int m = 0; m < mSize; m++) {
                for (int n = 0; n < nSize; n++) {
                    if (min > myArray[m][n]) min = myArray[m][n];
                    if (max < myArray[m][n]) max = myArray[m][n];
                    sum += myArray[m][n];
                }
            }

            printArray(myArray);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            System.out.println("Sum: " + sum);
            System.out.println("Mean: " + sum / (nSize * mSize));
        }
    }

    public static void printArray(int[][] array){
        System.out.println("Array:");
        for (int m = 0; m < array.length; m++) {
            System.out.print("[ ");
            for (int n = 0; n < array[0].length; n++) {
                System.out.print(array[m][n] + " ");
            }
            System.out.println("]");
        }
    }
}
