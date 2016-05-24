package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;

/**
 * Создать массив из 20 случайных чисел в диапазоне от -30 до 10.
 * Написать программу, определяющую сумму элементов массива,
 * находящихся в массиве до первого положительного элемента.
 */
public class HW6_task7_SumOfElements_v2 {
    public static void main(String[] args) {
        int min = -30;
        int max = 10;

        int sum = 0;

        int[] myArray = new int[20];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int) ((Math.random() * max) + (Math.random() * min));
        }

        boolean firstNeg = false;

        for (int i : myArray){
            if (i > 0) firstNeg = true;
            if (firstNeg) sum += i;
        }

        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Sum of values: " + sum);
    }
}
