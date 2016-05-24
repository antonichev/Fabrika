package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;

/**
 * Создать массив из 20 случайных чисел в диапазоне от -10 до 30.
 * Написать программу, определяющую сумму элементов массива,
 * находящихся в массиве после первого отрицательного элемента.
 */
public class HW6_task6_SumOfElements_v1 {
    public static void main(String[] args) {
        int min = -10;
        int max = 30;

        int sum = 0;

        int[] myArray = new int[20];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int) ((Math.random() * max) + (Math.random() * min));
        }

        boolean firstNeg = false;

        for (int i : myArray){
            if (i < 0) firstNeg = true;
            if (firstNeg) sum += i;
        }

        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Sum of values: " + sum);
    }
}
