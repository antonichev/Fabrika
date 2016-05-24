package ua.od.fabrika.antonichev.HW7;

/**
 * Создать массив размерностью M x N, заполненный случайными числами. Вывести на экран  строку,
 * для которой среднее арифметическое элементов максимально отличается от среднего арифметического
 * значения для всех элементов массива.
 */
public class HW7_task15_MeanOfRowInArray {
    public static void main(String[] args) {
        int row = 5, column = 5;

        int[][] myArray = new int[row][column];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                myArray[i][j] = (int) (Math.random() * 50);
            }
        }

        int sum_of_array = 0, mean_of_array = 0;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                sum_of_array += myArray[i][j];
            }
        }

        mean_of_array = sum_of_array / (row * column);
        int current_mean = 0, difference_of_mean = 0, current_index = 0;

        for (int i = 0; i < row; i++){
            int cur_sum = 0;

            for (int j = 0; j < column; j++){
                cur_sum += myArray[i][j];
            }

            current_mean = cur_sum / column;

            System.out.println("Mean in " + i + ": " + current_mean);

            if (Math.abs(mean_of_array - current_mean) > difference_of_mean){
                difference_of_mean = Math.abs(mean_of_array - current_mean);
                current_index = i;
            }
        }

        System.out.println("Original array: \n" + printArray(myArray));
        System.out.println("Mean of array: " + mean_of_array);

        System.out.print("Row (" + (current_index + 1)+ "): ");
        for (int i = 0; i < column; i++){
            System.out.print(myArray[current_index][i] + "\t");
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
