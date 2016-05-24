package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Осуществить циклический сдвиг массива на N элементов.
 * Направление сдвига указывает пользователь
 * (например, массив 0,1,2,3,4,5,6,7,8,9 при циклическом сдвиге
 * вправо на 3 элемента примет вид 7,8,9,0,1,2,3,4,5,6).
 */
public class HW6_task19_CircularShiftInArray {
    public static void main(String[] args) {
        int sizeOfArray = 10;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of shift:");
        int shift = input.nextInt();

        if (shift < 0) System.out.println("Error! Wrong data");
        else {
            int[] myArray = new int[sizeOfArray];

            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = (int) (Math.random() * 10);
            }

            System.out.println("Choose direction:");
            System.out.println("1. To right");
            System.out.println("2. To left");
            int choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Original array: " + Arrays.toString(myArray));

                    while (shift > 0){
                        int lastElement = myArray[sizeOfArray - 1];

                        for (int i = sizeOfArray - 1; i > 0; i--){
                            myArray[i] = myArray[i - 1];
                        }

                        myArray[0] = lastElement;
                        shift--;
                    }

                    break;
                case 2:
                    System.out.println("Original array: " + Arrays.toString(myArray));

                    while (shift > 0){
                        int firstElement = myArray[0];

                        for (int i = 0; i < myArray.length - 1; i++){
                            myArray[i] = myArray[i + 1];
                        }

                        myArray[sizeOfArray - 1] = firstElement;
                        shift--;
                    }

                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }

            System.out.println("Shifted array: " + Arrays.toString(myArray));
        }
    }
}
