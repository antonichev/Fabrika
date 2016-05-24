package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;

/**
 * Создать массив из 200 случайных чисел в диапазоне от 0 до 200.
 * Определить количество одноразрядных, двухразрядных и
 * трёхразрядных чисел в процентном отношении.
 */
public class HW6_task10_Decimals {
    public static void main(String[] args) {
        int min = 0;
        int max = 200;

        int sizeOfArray = 200;

        int oneD, twoD, threeD;

        oneD = twoD = threeD = 0;

        int[] myArray = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            myArray[i] = (int) (Math.random() * (max - min) + min);
        }

        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] / 10 == 0){
                oneD++;
            }
            else {
                if (myArray[i] / 100 == 0) {
                    twoD++;
                }
                else {
                    if (myArray[i] / 1000 == 0) {
                        threeD++;
                    }
                }
            }
        }

        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("One-digit numbers  : " + Math.round(((double) oneD * 100.0 / sizeOfArray) * 100.0) / 100.0 + "%");
        System.out.println("Two-digit numbers  : " + Math.round(((double) twoD * 100.0 / sizeOfArray) * 100.0) / 100.0 + "%");
        System.out.println("Three-digit numbers: " + Math.round(((double) threeD * 100.0 / sizeOfArray) * 100.0) / 100.0 + "%");
    }
}
