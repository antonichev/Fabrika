package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать массив из 10 вещественных чисел. Преобразовать массив так,
 * чтобы сначала шли все элементы с вещественной частью, а потом без нее.
 */
public class HW6_task17_RealPartArraySorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sizeOfArray = 10;

        float[] myArray = new float[sizeOfArray];
        float[] toolArray = new float[sizeOfArray];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter " + (i + 1) + " element of array:");
            myArray[i] = input.nextFloat();
        }

        int foreCount = 0, revCount = sizeOfArray - 1;

        for (int i = 0; i < myArray.length; i++){
            int checkNum = (int) myArray[i];

            if (myArray[i] % checkNum > 0){
                toolArray[foreCount] = myArray[i];
                foreCount++;
            }
            else {
                toolArray[revCount] = myArray[i];
                revCount--;
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(toolArray));
    }
}
