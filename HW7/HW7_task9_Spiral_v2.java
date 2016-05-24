package ua.od.fabrika.antonichev.HW7;

import java.util.Scanner;

/**
 * Заполнить квадратную матрицу размером M x N по спирали.
 * Число 1 ставится в угловой (например, верхний левый) элемент, и спираль закручивается к центру матрицы.
 */
public class HW7_task9_Spiral_v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size (not less than 2):");
        int sizeOfArray = input.nextInt();

        if (sizeOfArray <= 1){
            System.out.println("Error! Wrong data");
        }
        else {
            int[][] myArray = new int[sizeOfArray][sizeOfArray];
            int pointX = 0;
            int pointY = 0;

            int up_border = 0, down_border = sizeOfArray - 1, left_border = 0, right_border = sizeOfArray - 1;

            String direction = "Down";

            for (int value = 1; value <= sizeOfArray * sizeOfArray; value++) {
                myArray[pointY][pointX] = value;

                switch (direction){
                    case "Left":
                        if (pointX > left_border) pointX--;
                        else {
                            direction = "Down";
                            up_border++;
                            pointY++;
                        }
                        break;
                    case "Right":
                        if (pointX < right_border) pointX++;
                        else {
                            direction = "Up";
                            down_border--;
                            pointY--;
                        }
                        break;
                    case "Up":
                        if (pointY > up_border) pointY--;
                        else {
                            direction = "Left";
                            right_border--;
                            pointX--;
                        }
                        break;
                    case "Down":
                        if (pointY < down_border) pointY++;
                        else {
                            direction = "Right";
                            left_border++;
                            pointX++;
                        }
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
