package ua.od.fabrika.antonichev.HW12;

import java.util.Scanner;

/**
 * Точная степень двойки.
 * Дано натуральное число N. Выведите слово YES, если число N является точной степенью
 * двойки, или слово NO в противном случае.
 * Операцией возведения в степень пользоваться нельзя!
 * Ввод: 3 8
 * Вывод: NO YES
 */
public class HW12_task3_PowerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        if (number <= 0) System.out.println("Error! Wrong data");
        else {
            recursion(number);
        }
    }

    public static void recursion(int number){
        if (number == 2) {
            System.out.println("YES");
            return;
        }

        if (number == 1) {
            System.out.println("NO");
            return;
        }

        recursion(number / 2);
    }
}
