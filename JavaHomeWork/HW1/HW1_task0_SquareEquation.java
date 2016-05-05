package ua.od.fabrika.antonichev.HW1;

import java.util.Scanner;

/**
* Решение квадратного уравнения через дискриминант
*/
public class HW1_task0_SquareEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter \"A\": ");
        int a = input.nextInt();

        System.out.println("Please enter \"B\": ");
        int b = input.nextInt();

        System.out.println("Please enter \"C\": ");
        int c = input.nextInt();

        double x, x1, x2;

        if(a == 0 && b == 0 && c == 0){
            System.out.println("\"X\" can be any number.");
            return;
        }

        if(a==0 && b==0){
            if(c != 0) {
                System.out.println("Wrong data! \"C\" must be also = 0");
                return;
            }
        }
        else {
            if (a == 0) {
                System.out.print("It's linear equation, \"X\" = ");
                x = -1 * c / b;
                System.out.print(x);
            } else {
                double discr = b * b - 4 * a * c;

                if (discr < 0) {
                    System.out.println("There is no solution for that equation, sorry");
                } else {
                    if (discr == 0) {
                        System.out.println("D = " + discr);

                        System.out.print("X1 = X2 = ");
                        x = (-1 * b + Math.sqrt(discr)) / 2 * a;
                        System.out.print(x);
                    } else {
                        System.out.println("D = " + discr);

                        System.out.print("X1 = ");
                        x1 = (-1 * b + Math.sqrt(discr)) / 2 * a;
                        System.out.print(x1 + "\n");

                        System.out.print("X2 = ");
                        x2 = (-1 * b - Math.sqrt(discr)) / 2 * a;
                        System.out.print(x2);
                    }
                }
            }
        }
    }
}
