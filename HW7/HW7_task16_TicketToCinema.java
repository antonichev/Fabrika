package ua.od.fabrika.antonichev.HW7;

import java.util.Scanner;

/**
 * В кинотеатре M рядов по N мест в каждом. В двумерном массиве хранится информация о проданных билетах.
 * Число 1 означает, что билет на данное место уже продан, число 0 означает, что место свободно.
 * Поступил запрос на продажу K билетов на соседние места в одном ряду.
 * Определите, можно ли выполнить такой запрос. Число занятых мест, и какие места заняты на момент запроса,
 * определяется случайным образом. Вывести исходный массив на экран консоли.
 */
public class HW7_task16_TicketToCinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter row size size:");
        int rowSize = input.nextInt();

        System.out.println("Enter column size:");
        int columnSize = input.nextInt();

        System.out.println("Enter quantity of tickets:");
        int quantity = input.nextInt();

        if (rowSize <= 0 || columnSize <= 0 || quantity <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            int[][] myArray = new int[rowSize][columnSize];
            boolean isEnoughPlace = false;

            //Fill the array randomly with 0 and 1

            for (int i = 0; i < rowSize; i++){
                for (int j = 0; j < columnSize; j++){
                    if (Math.random() >= 0.5) myArray[i][j] = 1;
                    else myArray[i][j] = 0;
                }
            }

            System.out.println("Sitting places: \n" + printArray(myArray));

            for (int i = 0; i < rowSize; i++) {
                int near_free = 0;

                for (int j = 0; j < columnSize; j++) {
                    if (myArray[i][j] == 0) near_free++;
                    else near_free = 0;
                    if (near_free >= quantity) {
                        isEnoughPlace = true;
                        break;
                    }
                }
                if(isEnoughPlace) break;
            }

            if (isEnoughPlace) System.out.println("Yes, there is enough place(s) for Your order");
            else System.out.println("No, there isn't enough place(s) for Your order, sorry");
        }
    }

    public static String printArray(int[][] array){
        String outString = "";
        for (int m = 0; m < array.length; m++) {
            outString += "[";
            for (int n = 0; n < array[0].length; n++) {
                outString += array[m][n] + "\t ";
            }
            outString += "]\n";
        }
        return outString;
    }
}
