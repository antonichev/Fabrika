package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * Ввести с клавиатуры число. Проверить, что все цифры этого числа
 * расположены в неубывающем порядке (например, число 11299 соответствует
 * заданию, а число 22044 нет).
 */
public class HW5_task11_AscendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = input.nextInt();

        boolean ok = true;

        for (; num > 0; num /= 10)
        {
            if (num % 10 < num / 10 % 10)
                ok = false;
            break;
        }
        if (ok) System.out.println("Order is OK");
        else System.out.println("Order is not OK");
    }
}
