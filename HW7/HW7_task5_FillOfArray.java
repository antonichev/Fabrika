package ua.od.fabrika.antonichev.HW7;

import java.util.Scanner;

/**
 * Заполнить массив M x N двузначными числами так, чтобы первая цифра указывала
 * номер строки, а вторая – номер столбца.
 */
public class HW7_task5_FillOfArray {
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
            int rowCount = 10, columnCount = 1;

            int[][] myArray = new int[mSize][nSize];

            for (int m = 0; m < mSize; m++) {
                columnCount = 1;
                for (int n = 0; n < nSize; n++) {
                    myArray[m][n] = rowCount + columnCount;
                    columnCount++;
                }
                rowCount += 10;
            }

            printArray(myArray);
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
