package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;

/**
 * Создать массив из 10 случайных чисел в диапазоне от -20 до 20.
 * Определить количество, сумму  и среднее арифметическое положительных
 * элементов массива.
 */
public class HW6_task3_SumOfValues {
    public static void main(String[] args) {
        int min = -20;
        int max = 20;

        int sum = 0;
        int quantityOfValues = 0;

        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int) (Math.random() * max * 2 + min);
        }

        for (int i : myArray){
            if (i > 0){
                quantityOfValues++;
                sum += i;
            }
        }

        double mean = (quantityOfValues > 0) ? Math.round((double) sum / quantityOfValues * 100.0) / 100.0 : 0;

        System.out.println("Array                       : " + Arrays.toString(myArray));
        System.out.println("Quantity of positive values : " + quantityOfValues);
        System.out.println("Sum of positive values      : " + sum);
        System.out.println("Mean of positive values     : " + mean);
    }
}
