package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Даны 2 массива размерности M и N соответственно. Необходимо
 * переписать в третий массив общие элементы первых двух массивов, без повторений.
 */
public class HW6_task14_MergeArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first array size:");
        int firstArraySize = input.nextInt();

        System.out.println("Enter second array size:");
        int secondArraySize = input.nextInt();

        int[] firstArray = new int[firstArraySize];
        int[] secondArray = new int[secondArraySize];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 10 + 1);
        }

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = (int) (Math.random() * 10 + 1);
        }

        int[] toolArray = new int[firstArraySize + secondArraySize];

        int count = 0;

        for (int i = 0; i < firstArray.length; i++){
            for (int j = 0; j < secondArray.length; j++){
                if (firstArray[i] == secondArray[j]){
                    if (count > 0){
                        boolean isExist = false;

                        for (int m = 0; m < count; m++){
                            if (firstArray[i] == toolArray[m]){
                                isExist = true;
                            }
                        }

                        if (!isExist){
                            toolArray[count] = firstArray[i];
                            count++;
                        }
                    }
                    else {
                        toolArray[count] = firstArray[i];
                        count++;
                    }
                }
            }
        }

        int[] commonArray = new int[count];

        for (int i = 0; i < count; i++){
            commonArray[i] = toolArray[i];
        }

        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
        System.out.println("Common elements array: " + Arrays.toString(commonArray));
    }
}
