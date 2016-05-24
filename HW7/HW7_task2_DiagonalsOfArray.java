package ua.od.fabrika.antonichev.HW7;

import java.util.Scanner;

/**
 * Дан двумерный массив размерностью M х N, заполненный случайными числами из диапазона от 0 до 20.
 * Определить сумму элементов, расположенных на главной диагонали, а также сумму элементов,
 * расположенных на побочной диагонали.
 */
public class HW7_task2_DiagonalsOfArray {
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

            int mainSum = 0, secondarySum = 0;

            for (int m = 0; m < mSize; m++) {
                for (int n = 0; n < nSize; n++) {
                    if (m == n) {
                        mainSum += myArray[m][n];
                    }
                    if (m + n == myArray.length - 1){
                        secondarySum += myArray[m][n];
                    }
                }
            }

            printArray(myArray);
            System.out.println("Sum of elements on main diagonal: " + mainSum);
            System.out.println("Sum of elements on secondary diagonal: " + secondarySum);
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
