package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;

/**
 * Создать массив из 20 случайных чисел. Определить минимальный и
 * максимальный элемент массива (вывести значение и порядковый номер).
 */
public class HW6_task8_MinAndMaxOfArray {
    public static void main(String[] args) {
        int[] myArray = new int[20];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int) (Math.random() * 100 - 50);
        }

        int max, min, maxPosition, minPosition;
        maxPosition = minPosition = 0;
        max = min = myArray[0];

        for (int i = 0; i < myArray.length; i++){
            if (min > myArray[i]){
                min = myArray[i];
                minPosition = i;
            }

            if (max < myArray[i]){
                max = myArray[i];
                maxPosition = i;
            }
        }

        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Min value: " + min);
        System.out.println("Min value index: " + minPosition);
        System.out.println("Max value: " + max);
        System.out.println("Max value index: " + maxPosition);
    }
}
