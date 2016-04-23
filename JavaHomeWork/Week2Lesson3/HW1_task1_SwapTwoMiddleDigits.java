package ua.od.fabrika.antonichev.HW1;

/**
* Ввести с клавиатуры два 3-значных числа и поменять у них средние цифры
* (например, ввести 357  и 702 – получить и вывести числа  307 и 752).
*/

import java.util.Scanner;

public class HW1_task1_SwapTwoMiddleDigits {

    public static void main(String[] args) {
        int f_first, f_middle, f_last, s_first, s_middle, s_last;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int first_num = input.nextInt();

        System.out.println("Please enter second number: ");
        int second_num = input.nextInt();

        if (first_num > 999 || first_num < 100){
            System.out.println("Error! (first number is wrong)");
            return;
        }

        if (second_num > 999 || second_num < 100){
            System.out.println("Error! (second number is wrong)");
            return;
        }

        f_first = first_num / 100;
        s_first = second_num / 100;

        f_middle = first_num / 10; f_middle %= 10;
        s_middle = second_num / 10; s_middle %= 10;

        f_last = first_num % 10;
        s_last = second_num % 10;

        System.out.println("Result: " + f_first + s_middle + f_last + " & " + s_first + f_middle + s_last);
    }
}
