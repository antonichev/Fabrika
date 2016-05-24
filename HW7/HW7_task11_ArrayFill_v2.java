package ua.od.fabrika.antonichev.HW7;

import java.util.Scanner;

/**
 * Заполнить массив M x N следующим образом:
 * 1   2   3   4   5   6   7   8   9
 * 18  17  16  15  14  13  12  11  10
 * 19  20  21  22  23  24  25  26  27
 */
public class HW7_task11_ArrayFill_v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter row size size:");
        int rowSize = input.nextInt();

        System.out.println("Enter column size:");
        int columnSize = input.nextInt();

        if (rowSize <= 0 || columnSize <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            int[][] myArray = new int[rowSize][columnSize];

            int value = 1, row = 0;

            while (row < rowSize) {
                if (row % 2 == 0) {
                    for (int column = 0; column < columnSize; column++) {
                        myArray[row][column] = value;
                        value++;
                    }
                }
                else {
                    for (int column = columnSize - 1; column >= 0; column--) {
                        myArray[row][column] = value;
                        value++;
                    }
                }

                row++;
            }

            System.out.println(printArray(myArray));
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
