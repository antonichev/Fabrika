package ua.od.fabrika.antonichev.HW4;

import java.util.Scanner;

/**
 * Определить, параллельна ли определённая прямая линия оси ординат,
 * либо оси абсцисс. Прямая задаётся двумя точками.
 */
public class HW4_task1_ParallelStraight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter X1:");
        int x1 = input.nextInt();

        System.out.println("Enter Y1:");
        int y1 = input.nextInt();

        System.out.println("Enter X2:");
        int x2 = input.nextInt();

        System.out.println("Enter Y2:");
        int y2 = input.nextInt();

        if (x1 == x2 && y1 == y2){
            System.out.println("It's a point actually");
        }
        else {
            if (x1 == x2){
                System.out.println("Straight parallel to the y-axis");
            }
            if (y1 == y2){
                System.out.println("Straight parallel to the x-axis");
            }
            if (x1 != x2 && y1 != y2){
                System.out.println("Straight not parallel neither x-axis nor y-axis");
            }
        }
    }
}
