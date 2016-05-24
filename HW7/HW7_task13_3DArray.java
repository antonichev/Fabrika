package ua.od.fabrika.antonichev.HW7;

/**
 * Заполнить трёхмерный массив N x N x N нулями. В получившийся куб вписать шар, состоящий из единиц.
 * После чего, разрезать куб на N слоёв, и показать каждый слой в виде двумерного массива N x N на экране консоли.
 */
public class HW7_task13_3DArray {
    public static void main(String[] args) {
        int size = 10;

        int[][][] myArray = new int[size][size][size];

        for (int x = 0; x < size; x++){
            for (int y = 0; y < size; y++){
                for (int z = 0; z < size; z++){
                    myArray[x][y][z] = 0;
                }
            }
        }

        int radius = size / 2;

        for (int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                for (int z = 0; z < size; z++){
                    if (Math.round(Math.sqrt(Math.pow((x - radius), 2) + Math.pow((y - radius), 2) + Math.pow((z - radius), 2))) < radius){
                        myArray[x][y][z] = 1;
                    }
                }
            }
        }

        for (int k = 0; k < size; k++){
            for (int i = 0; i < size; i++){
                for (int j = 0; j < size; j++){
                    System.out.print(myArray[k][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
