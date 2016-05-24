package ua.od.fabrika.antonichev.HW7;

import java.util.Scanner;

/**
 * Заполнить массив M x N следующим образом:
 *  1   57	19	45	29	36	25	52	11	60
 * 58	2	46	20	35	26	37	12	53	10
 * 18	47	3	34	21	44	13	38	9	54
 * 48	17	33	4	51	14	43	8	39	24
 * 28	32	16	50	5	56	7	42	23	40
 * 31	27	49	15	59	6	55	22	41	30
 */
public class HW7_task12_ArrayFill_v3 {
    public static void main(String[] args) {
        int rowSize = 6;
        int columnSize = 10;

        int[][] myArray = new int[rowSize][columnSize];

        int value = 1, row = 0, column = 0;
        int up_border = 0, down_border = rowSize - 1, left_border = 0, right_border = columnSize - 1;

        String direction = "Down & right";

        while (value <= columnSize * rowSize){

                myArray[row][column] = value;

                switch (direction){
                    case "Down & right":
                        if (row == down_border){//Hit the ground
                            if (row == down_border && column == right_border){ //Lower right corner
                                direction = "Lower right corner";
                                continue;
                            }
                            direction = "Up & right";
                            continue;
                        }
                        else {
                            if (column == right_border){
                                direction = "Down & left";
                                continue;
                            }
                            else {
                                do {
                                    row++;
                                    column++;
                                }
                                while (myArray[row][column] != 0);
                            }
                        }
                        break;
                    case "Up & right":
                        if (column == right_border){//Hit the right side
                            if (row == up_border && column == right_border){ //Upper right corner
                                direction = "Upper right corner";
                                continue;
                            }
                            direction = "Up & left";
                            continue;
                        }
                        else {
                            if (row == up_border){//Hit the up side
                                direction = "Down & right";
                                continue;
                            }
                            do {
                                row--;
                                column++;
                            }
                            while (myArray[row][column] != 0);
                        }
                        break;
                    case "Up & left":
                        if (row == up_border){//Hit the up side
                            direction = "Down & left";
                            continue;
                        }
                        else {
                            if (column == left_border) {//Hit the left side
                                direction = "Up & right";
                                continue;
                            }
                            else {
                                do {
                                    row--;
                                    column--;
                                }
                                while (myArray[row][column] != 0);
                            }
                        }
                        break;
                    case "Down & left":
                        if (row == down_border){//Hit the down side
                            direction = "Up & left";
                            continue;
                        }
                        else {
                            if (column == left_border){
                                direction = "Down & right";
                                continue;
                            }
                            else {
                                do {
                                    row++;
                                    column--;
                                }
                                while (myArray[row][column] != 0);
                            }
                        }
                        break;
                    case "Lower right corner":
                            row = down_border;
                            column = left_border;
                            direction = "Up & right";
                        break;
                    default:
                        break;
                }
                value ++;
        }

        System.out.println(printArray(myArray));
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
