package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;

/**
 * Создать массив из 10 целых случайных чисел.
 * Изменить порядок следования элементов массива на противоположный
 * (1-й элемент меняется с 10-м, 2-й элемент с 9-м и тд).
 */
public class HW6_task11_ArraySwap {
    public static void main(String[] args) {
        int sizeOfArray = 10;

        int[] myArray = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            myArray[i] = (int) (Math.random() * 1000);
        }

        System.out.println("Initial array: " + Arrays.toString(myArray));

        for (int i = 0, j = sizeOfArray - 1; i < sizeOfArray; i++, j--){
            int temp = myArray[i];

            myArray[i] = myArray[j];
            myArray[j] = temp;

            if (i == j - 1){
                break;
            }
        }

        System.out.println("Final array  : " + Arrays.toString(myArray));
    }
}
