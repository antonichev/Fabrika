package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * Вывести на экран горизонтальную линию из звёздочек.
 * Число звездочек указывает пользователь.
 */
public class HW5_task1_Asterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity of asterisks:");
        int star = input.nextInt();

        if (star <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            for (int i = 1; i <= star; i++) {
                System.out.print("*");
            }
        }
    }
}
