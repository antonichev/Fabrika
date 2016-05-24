package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;

/**
 * Написать программу, копирующую один массив в другой следующим образом:
 * сначала копируются последовательно все элементы, большие 0, затем
 * последовательно все элементы, равные 0, а затем последовательно все элементы, меньшие 0.
 */
public class HW6_task13_CopyOfArray_v2 {
    public static void main(String[] args) {
        int[] originalArray = new int[100];

        for (int i = 0; i < originalArray.length; i++){
            originalArray[i] = (int) (Math.random() * 200 * 2 - 200);
        }

        System.out.println("Original array: " + Arrays.toString(originalArray));

        heapSort(originalArray, false);

        System.out.println("Sorted array: " + Arrays.toString(originalArray));

        heapSort(originalArray, true);

        System.out.println("Re-sorted array: " + Arrays.toString(originalArray));
    }

    static void heapSort(int[] array, boolean reverse)
    {
        int i;
        int temp;

        for (i = array.length / 2 - 1; i >= 0; i--)
        {
            if (!reverse) shiftDown(array, i, array.length);
            else shiftUp(array, i, array.length);
        }

        for (i = array.length - 1; i >= 1; i--)
        {
            temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            if (!reverse) shiftDown(array, 0, i);
            else shiftUp(array, 0, i);
        }
    }

    static void shiftDown(int[] array, int i, int j)
    {
        boolean done = false;
        int maxChild;
        int temp;

        while ((i * 2 + 1 < j) && (!done))
        {
            if (i * 2 + 1 == j - 1)
                maxChild = i * 2 + 1;
            else if (array[i * 2 + 1] > array[i * 2 + 2])
                maxChild = i * 2 + 1;
            else
                maxChild = i * 2 + 2;

            if (array[i] < array[maxChild])
            {
                temp = array[i];
                array[i] = array[maxChild];
                array[maxChild] = temp;
                i = maxChild;
            }
            else
            {
                done = true;
            }
        }
    }

    static void shiftUp(int[] array, int i, int j)
    {
        boolean done = false;
        int minChild;
        int temp;

        while ((i * 2 + 1 < j) && (!done))
        {
            if (i * 2 + 1 == j - 1)
                minChild = i * 2 + 1;
            else if (array[i * 2 + 1] < array[i * 2 + 2])
                minChild = i * 2 + 1;
            else
                minChild = i * 2 + 2;

            if (array[i] > array[minChild])
            {
                temp = array[i];
                array[i] = array[minChild];
                array[minChild] = temp;
                i = minChild;
            }
            else
            {
                done = true;
            }
        }
    }
}
