package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;

/**
 * Создать массив из 10 целых случайных чисел в диапазоне от 0 до 100.
 * Найти элемент, максимально близкий к среднему арифметическому значений массива.
 */
public class HW6_task18_ClosestToMean {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int) (Math.random() * 100);
        }

        int sum = 0;
        double mean = 0;

        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }

        mean = (double) sum / myArray.length;

        int diff = 100, nearestToMean = 0;

        for (int i = 0; i < myArray.length; i++){
            if (diff > Math.abs(mean - myArray[i])) {
                diff = (int) Math.abs(mean - myArray[i]);
                nearestToMean = myArray[i];
            }
        }

        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Sum of elements: " + sum);
        System.out.println("Mean of array: " + mean);
        System.out.println("Nearest to mean: " + nearestToMean);
    }
}
