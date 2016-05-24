package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;

/**
 * Создать массив из 20 случайных чисел в диапазоне от -10 до 20.
 * Определить максимальное количество подряд идущих положительных элементов,
 * не прерываемых ни нулями, ни отрицательными числами. Вывести найденный фрагмент.
 */
public class HW6_task16_MaxOfPositives {
    public static void main(String[] args) {
        int min = -10;
        int max = 20;
        int arraySize = 20;

        int quantity = 0;

        int[] myArray = new int[arraySize];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) ((Math.random() * max) + (Math.random() * min));
        }

        int[] toolArray = new int[arraySize];

        int count = 0;
        int toolCount = 0;

        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] > 0){
                count++;
            }
            else{
                toolArray[toolCount] = count;
                count = 0;
                toolCount++;
            }
        }

        System.out.println("Array: " + Arrays.toString(myArray));

        for (int i = 0; i < toolArray.length; i++){
            if (quantity <= toolArray[i]) quantity = toolArray[i];
        }

        System.out.println("Quantity of positive elements, followed one-by-one: " + quantity);
    }
}
