package ua.od.fabrika.antonichev.HW6;

import java.util.Scanner;

/**
 * Ввести массив из 5 чисел, а затем вывести его в обратном порядке.
 */
public class HW6_task1_ReversingOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int sizeOfArray = input.nextInt();

        if (sizeOfArray <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            int[] initialArray = new int[sizeOfArray];
            int[] reversedArray = new int[sizeOfArray];

            System.out.print("\nInitial array: ");
            for (int i = 0; i < sizeOfArray; i++) {
                initialArray[i] = (int) (Math.random() * 100);
                System.out.print(initialArray[i] + " ");
            }

            System.out.print("\nReversed array: ");
            for (int i = sizeOfArray - 1, j = 0; j < sizeOfArray; i--, j++){
                reversedArray[j] = initialArray[i];
                System.out.print(initialArray[i] + " ");
            }
        }
    }
}
