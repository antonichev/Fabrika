package ua.od.fabrika.antonichev.HW6;

import java.util.Scanner;

/**
 * Создать массив из 20 случайных чисел.
 * Вывести все элементы массива с чётными индексами.
 */
public class HW6_task2_EvenIndexesOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int sizeOfArray = input.nextInt();

        if (sizeOfArray <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            int[] myArray = new int[sizeOfArray];

            for (int i = 0; i < sizeOfArray; i++) {
                myArray[i] = (int) (Math.random() * 100);
            }

            for (int i = 0; i < myArray.length; i++){
                if (i % 2 == 0){
                    System.out.println("Index " + i + ", value " + myArray[i]);
                }
            }
        }
    }
}
