package ua.od.fabrika.antonichev.HW6;

import java.util.Scanner;

/**
 * Сортировка подсчетом
 */
public class HW6_task0_SortingOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter minimum value:");
        int min = input.nextInt();

        System.out.println("Enter maximum value:");
        int max = input.nextInt();

        System.out.println("Enter size of array:");
        int sizeOfArray = input.nextInt();

        if (sizeOfArray <= 0 || max <= min){
            System.out.println("Error! Wrong data");
        }
        else {
            int[] initialArray = new int[sizeOfArray];
            int[] toolArray = new int[max];

            int counter = 0;

            System.out.print("\nInitial array: ");
            for (int i = 0; i < initialArray.length; i++) {
                initialArray[i] = (int) (Math.random() * (max - min) + min);
                System.out.print(initialArray[i] + " ");
            }

            for (int i = 0; i < sizeOfArray; i++) {
                toolArray[initialArray[i]]++;
            }

            for (int i = 0; i < toolArray.length; i++) {
                if (toolArray[i] > 0) {
                    for (int j = 0; j < toolArray[i]; j++) {
                        initialArray[counter] = i;
                        counter++;
                    }
                }
            }

            System.out.print("\nSorted initial array: ");
            for (int i = 0; i < sizeOfArray; i++) {
                System.out.print(initialArray[i] + " ");
            }
        }
    }
}
