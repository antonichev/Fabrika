package ua.od.fabrika.antonichev.HW12;

import java.util.Scanner;

/**
 * От A до B.
 * Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке
 * возрастания, если A < B, или в порядке убывания в противном случае.
 * Ввод: 5 1
 * Вывод: 5 4 3 2 1
 */
public class HW12_task2_FromAToB {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter A:");
        int a = input.nextInt();

        System.out.println("Enter B:");
        int b = input.nextInt();

        System.out.println(recursion(a, b));
    }

    public static String recursion(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a + 1, b);
        }
    }
}
