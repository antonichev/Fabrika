package ua.od.fabrika.antonichev.HW7;

import java.util.Scanner;

/**
 * В двумерном массиве размерности M x N поменять местами чётные строки с нечётными.
 */
public class HW7_task6_ChangeRows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter M-array size (must be even):");
        int mSize = input.nextInt();

        System.out.println("Enter N-array size:");
        int nSize = input.nextInt();

        if (mSize <= 0 || nSize <= 0 || mSize % 2 != 0){
            System.out.println("Error! Wrong data");
        }
        else {

            String[][] myArray = new String[mSize][nSize];

            for (int m = 0; m < mSize; m++) {
                for (int n = 0; n < nSize; n++) {
                    if (m % 2 != 0) myArray[m][n] = "even";
                    else myArray[m][n] = "odd";
                }
            }

            System.out.println("Original array:");
            System.out.println(printArray(myArray));

            for (int m = 0; m < mSize - 1; m++) {
                String tempValue = "";

                for (int n = 0; n < nSize; n++) {
                    tempValue = myArray[m + 1][n];
                    myArray[m + 1][n] = myArray[m][n];
                    myArray[m][n] = tempValue;
                }
            }

            System.out.println("Shifted array:");
            System.out.println(printArray(myArray));
        }
    }
    public static String printArray(String[][] array){
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
