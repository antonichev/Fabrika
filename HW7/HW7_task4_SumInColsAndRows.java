package ua.od.fabrika.antonichev.HW7;

import java.util.Scanner;

/**
 * Дан двумерный массив размерностью M х N, заполненный случайными числами из диапазона от 0 до 20.
 * Определить сумму по каждой строке и по каждому столбцу массива.
 */
public class HW7_task4_SumInColsAndRows {
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

            printArray(myArray);

            int rowSum = 0, columnSum = 0;

            for (int m = 0; m < mSize; m++) {
                rowSum = 0;
                for (int n = 0; n < nSize; n++) {
                    rowSum += myArray[m][n];
                }
                System.out.println("Sum of elements in " + (m + 1) + " row: " + rowSum);
            }

            for (int n = 0; n < nSize; n++) {
                columnSum = 0;
                for (int m = 0; m < mSize; m++) {
                    columnSum += myArray[m][n];
                }
                System.out.println("Sum of elements in " + (n + 1) + " column: " + columnSum);
            }
        }
    }

    public static void printArray(int[][] array){
        System.out.println("Array:");
        for (int m = 0; m < array.length; m++) {
            System.out.print("[");
            for (int n = 0; n < array[0].length; n++) {
                System.out.print(array[m][n] + "\t ");
            }
            System.out.println("]");
        }
    }
}
