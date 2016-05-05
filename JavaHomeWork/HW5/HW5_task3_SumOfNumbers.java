package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * Вычислить сумму чисел в диапазоне от M до N.
 */
public class HW5_task3_SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter M:");
        int m = input.nextInt();

        System.out.println("Enter N:");
        int n = input.nextInt();

        if (n < m || n == m){
            System.out.println("Error! Wrong data");
        }
        else {
            int iter = 1;

            for (int i = m; i <= n; i++) {
                if (iter != 1) m += i;
                iter++;
            }
            System.out.print("Result: " + m);
        }
    }
}
