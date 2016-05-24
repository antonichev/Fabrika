package ua.od.fabrika.antonichev.HW7;

import java.util.Scanner;

/**
 * Заполнить массив M x N следующим образом:
 * 1   2   3   4   5   6   7   8   9
 * 10  11  12  13  14  15  16  17  18
 * 19  20  21  22  23  24  25  26  27
 */
public class HW7_task10_ArrayFill_v1 {
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

                for (int column = 0; column < columnSize; column++) {
                    myArray[row][column] = value;
                    value++;
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
