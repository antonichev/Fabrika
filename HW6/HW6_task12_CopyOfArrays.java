package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;

/**
 * Создать два массива A и B по 5 элементов. Создать третий массив C на 10 элементов,
 * в который копируются элементы из первого и второго массива поочередно
 * (например, С[0]=A[0], c[1]=B[0], C[2]=A[1], C[3]=B[1] и тд).
 */
public class HW6_task12_CopyOfArrays {
    public static void main(String[] args) {
        int[] a_array = new int[5];
        int[] b_array = new int[5];
        int[] c_array = new int[10];

        for (int i = 0; i < a_array.length; i++) {
            a_array[i] = (int) (Math.random() * 1000);
        }

        for (int i = 0; i < b_array.length; i++) {
            b_array[i] = (int) (Math.random() * 1000);
        }

        int c_count = 0;

        for (int a = 0; a < 5; a++){
            c_array[c_count] = a_array[a];
            c_count++;
            c_array[c_count] = b_array[a];
            c_count++;
        }

        System.out.println("Array A: " + Arrays.toString(a_array));
        System.out.println("Array B: " + Arrays.toString(b_array));
        System.out.println("Array C: " + Arrays.toString(c_array));
    }
}
