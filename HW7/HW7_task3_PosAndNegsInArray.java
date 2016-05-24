package ua.od.fabrika.antonichev.HW7;

import java.util.Scanner;

/**
 * Дан двумерный массив размерностью M х N, заполненный случайными числами из диапазона от -10 до 10.
 * Определить количество положительных, отрицательных и нулевых элементов.
 */
public class HW7_task3_PosAndNegsInArray {
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

            int min = -10;
            int max = 10;

            for (int m = 0; m < mSize; m++) {
                for (int n = 0; n < nSize; n++) {
                    myArray[m][n] = (int) (Math.random() * max * 2 + min);
                }
            }

            int pos = 0, negs = 0, zero = 0;

            for (int m = 0; m < mSize; m++) {
                for (int n = 0; n < nSize; n++) {
                    if (myArray[m][n] > 0) pos++;
                    if (myArray[m][n] < 0) negs++;
                    if (myArray[m][n] == 0 ) zero++;
                }
            }

            printArray(myArray);
            System.out.println("Total positive elements: " + pos);
            System.out.println("Total negative elements: " + negs);
            System.out.println("Total elements, that equals 0: " + zero);
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
