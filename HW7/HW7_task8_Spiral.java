package ua.od.fabrika.antonichev.HW7;

import java.util.Scanner;

/**
 * Заполнить квадратную матрицу размером M x N по спирали. Число 1 ставится в центр матрицы,
 * а затем массив заполняется по спирали против часовой стрелки значениями по возрастанию.
 */
public class HW7_task8_Spiral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size (not less than 5):");
        int sizeOfArray = input.nextInt();

        if (sizeOfArray <= 4){
            System.out.println("Error! Array size is too smzll");
        }
        else {
            int[][] myArray = new int[sizeOfArray][sizeOfArray];
            int pointX = sizeOfArray / 2;
            int pointY = sizeOfArray / 2;

            String direction = "Left";

            for (int value = 1; value <= sizeOfArray * sizeOfArray; value++) {
                myArray[pointY][pointX] = value;

                switch (direction){
                    case "Left":
                        if(myArray[pointY][pointX - 1] == 0){
                            pointX--;
                            direction = "Down";
                        }
                        else pointY--;
                        break;
                    case "Right":
                        if(myArray[pointY][pointX + 1] == 0){
                            pointX++;
                            direction = "Up";
                        }
                        else pointY++;
                        break;
                    case "Up":
                        if(myArray[pointY - 1][pointX] == 0){
                            pointY--;
                            direction = "Left";
                        }
                        else pointX++;
                        break;
                    case "Down":
                        if(myArray[pointY + 1][pointX] == 0){
                            pointY++;
                            direction = "Right";
                        }
                        else pointX--;
                        break;
                    default:
                        break;
                }
            }

            System.out.println("Array:");
            System.out.println(printArray(myArray));
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
