package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Пользователь задаёт координаты верхнего левого,
 * и нижнего правого угла прямоугольника, а также координаты точки (X,Y)
 * в декартовой системе координат. Принадлежит ли точка этому прямоугольнику?
 */
public class HW2_task13_PointInRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter coordinate of upper-left corner (X): ");
        int upperLeftX = input.nextInt();

        System.out.println("Please enter coordinate of upper-left corner (Y): ");
        int upperLeftY = input.nextInt();

        System.out.println("Please enter coordinate of lower-right corner (X): ");
        int lowerRightX = input.nextInt();

        System.out.println("Please enter coordinate of lower-right corner (Y): ");
        int lowerRightY = input.nextInt();

        System.out.println("Please enter \"X\" coordinate of point: ");
        int x = input.nextInt();

        System.out.println("Please enter \"Y\" coordinate of point: ");
        int y = input.nextInt();

        if ((x > upperLeftX && x < lowerRightX) && (y < upperLeftY && y > lowerRightY)){
            System.out.println("Point belongs to rectangle");
        }
        else {
            System.out.println("Point not belongs to rectangle");
        }
    }
}
