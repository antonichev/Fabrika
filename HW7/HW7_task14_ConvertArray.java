package ua.od.fabrika.antonichev.HW7;

import java.util.Arrays;

/**
 * Реализовать преобразование двумерного массива в одномерный, и наоборот.
 */
public class HW7_task14_ConvertArray {
    public static void main(String[] args) {
        int row = 3, column = 3;

        int[][] myArray = new int[row][column];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                myArray[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Original array: \n" + printArray(myArray));

        //Two dimension array to one dimension array
        int[] oneDArray = new int[row * column];

        int count = 0;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                oneDArray[count] = myArray[i][j];
                count++;
            }
        }

        System.out.println("One dimensional array:");
        System.out.println(Arrays.toString(oneDArray));

        //One dimension array to two dimension array
        count = 0;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                myArray[i][j] = oneDArray[count];
                count++;
            }
        }

        System.out.println("Converted array: \n" + printArray(myArray));
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
