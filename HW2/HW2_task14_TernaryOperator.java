package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Найти максимальное значение среди 4 переменных,
 * используя тернарный оператор.
 */
public class HW2_task14_TernaryOperator {
    public static void main(String[] args) {
        int maximum1, maximum2, maximum;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num_1 = input.nextInt();

        System.out.println("Please enter second number: ");
        int num_2 = input.nextInt();

        System.out.println("Please enter third number: ");
        int num_3 = input.nextInt();

        System.out.println("Please enter forth number: ");
        int num_4 = input.nextInt();

        maximum1 = num_1 > num_2 ? num_1 : num_2;
        maximum2 = num_3 > num_4 ? num_3 : num_4;
        maximum = maximum1 > maximum2 ? maximum1 : maximum2;

        System.out.println("Maximum is " + maximum);
    }
}
