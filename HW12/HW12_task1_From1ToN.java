package ua.od.fabrika.antonichev.HW12;

import java.util.Scanner;

/**
 * От 1 до n.
 * Дано натуральное число n. Выведите все числа от 1 до n.
 * Ввод: 5
 * Вывод: 1 2 3 4 5
 */
public class HW12_task1_From1ToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = input.nextInt();

        if (n <= 0) System.out.println("Error! Wrong data");
        else {
            recursion(n);
        }
    }

    public static void recursion(int n){
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        recursion(n - 1);
    }
}
