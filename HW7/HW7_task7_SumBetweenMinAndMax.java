package ua.od.fabrika.antonichev.HW7;

import java.util.Scanner;

/**
 * Дан двумерный массив размерностью M x N, заполненный случайными числами из диапазона от -100 до 100.
 * Определить сумму элементов массива, расположенных между минимальным и максимальным элементами.
 */
public class HW7_task7_SumBetweenMinAndMax {
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
            int minRnd = -100, maxRnd = 100;

            int[][] myArray = new int[mSize][nSize];

            for (int m = 0; m < mSize; m++) {
                for (int n = 0; n < nSize; n++) {
                    myArray[m][n] = (int) (Math.random() * maxRnd * 2 + minRnd);
                }
            }

            //Find out min and max in array

            int min = myArray[0][0], max = myArray[0][0];

            for (int m = 0; m < mSize; m++) {
                for (int n = 0; n < nSize; n++) {
                    if (min > myArray[m][n]) min = myArray[m][n];
                    if (max < myArray[m][n]) max = myArray[m][n];
                }
            }

            //Find out sum
            int sum = 0;

            for (int m = 0; m < mSize; m++) {
                for (int n = 0; n < nSize; n++) {
                    if (myArray[m][n] > min || myArray[m][n] < max) sum += myArray[m][n];
                }
            }

            System.out.println("Array:");
            System.out.println(printArray(myArray));

            System.out.println("Max element: " + max);
            System.out.println("Min element: " + min);
            System.out.println("Sum of elements: " + sum);
        }
    }

    public static String printArray(int[][] array){
        String outString = "";
        for (int m = 0; m < array.length; m++) {
            outString += "[";
            for (int n = 0; n < array[0].length; n++) {
                outString += array[m][n] + "\t ";
            }
            outString += "]\n";
        }
        return outString;
    }
}
