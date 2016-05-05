package ua.od.fabrika.antonichev.HW5;

import java.util.Arrays;

/**
 * Показать на экран все восьмизначные числа, цифры в которых не повторяются.
 * Эти числа должны делиться на 12345 без остатка. Показать общее количество найденных чисел.
 */
public class HW5_task14_EightDigitNumbers {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10000000; i <= 99999999; i++){
            int num1 = i / 10000000;
            int num2 = i / 1000000 % 10;
            int num3 = i / 100000 % 10;
            int num4 = i / 10000 % 10;
            int num5 = i / 1000 % 10;
            int num6 = i / 100 % 10;
            int num7 = i / 10 % 10;
            int num8 = i % 10;

            Integer[] array = new Integer[8];

            array[0] = num1;

            if (!Arrays.asList(array).contains(num2)){
                array[1] = num2;
                if (!Arrays.asList(array).contains(num3)){
                    array[2] = num3;
                    if (!Arrays.asList(array).contains(num4)){
                        array[3] = num4;
                        if (!Arrays.asList(array).contains(num5)){
                            array[4] = num5;
                            if (!Arrays.asList(array).contains(num6)){
                                array[5] = num6;
                                if (!Arrays.asList(array).contains(num7)){
                                    array[6] = num7;
                                    if (!Arrays.asList(array).contains(num8)){
                                        array[7] = num8;

                                        if (i % 12345 == 0){
                                            System.out.println(i);
                                            count++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Total numbers: " + count);
    }
}
