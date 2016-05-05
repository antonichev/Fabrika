package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры сумму в гривнах (дробное число).
 * Вывести по отдельности количество гривен и количество копеек
 * (например, ввести 45.67 гривен - получить и вывести 45 гривен 67 копеек)
 */
public class HW3_task3_HrnAndKop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount in UAH:");
        double amount = input.nextDouble();

        if (amount <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            int hrn = (int)amount;

            if (hrn > 0){
                amount -= hrn;
            }
            amount *= 100;

            int kop = (int) amount;

            System.out.println("It will be " + hrn + " hrn. and " + kop + " kop.");
        }
    }
}
