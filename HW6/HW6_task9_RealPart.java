package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;

/**
 * Создать массив на 100 вещественных чисел.
 * Определить, сколько элементов массива не имеют вещественной части.
 */
public class HW6_task9_RealPart {
    public static void main(String[] args) {
        float[] myArray = new float[100];

        for (int i = 0; i < myArray.length; i++){
            if (i % 3 == 0) {
                myArray[i] = (float) (Math.random() * 100);
            }
            else {
                myArray[i] = (int) (Math.random() * 100);
            }
        }

        String valuesWithRealPart = "";
        String valuesWithoutRealPart = "";

        for (int i = 0; i < myArray.length; i++){
            int checkNum = (int) myArray[i];

            if (myArray[i] % checkNum > 0){
                valuesWithRealPart += myArray[i] + " ";
            }
            else {
                valuesWithoutRealPart += myArray[i] + " ";
            }
        }
        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Has real part: " + valuesWithRealPart);
        System.out.println("Hasn't real part: " + valuesWithoutRealPart);
    }
}
