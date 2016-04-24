package ua.od.fabrika.antonichev.HW1;

import java.util.Scanner;

/**
 * Написать программу, которая предлагает пользователю ввести сумму денежного вклада
 * в гривнах, а также процент годовых, которые выплачивает банк. Определить сумму денег,
 * выплачиваемых банком вкладчику каждый месяц.
 */
public class HW1_task4_BankDeposit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter amount of deposit ($): ");
        double depo = input.nextInt();

        System.out.println("Please enter bank's percents per year (without % symbol): ");
        double percent = input.nextInt();

        double one_month_percentage = percent / 12;

        System.out.println("You'll get " + depo * one_month_percentage / 100 + "$ per month");
    }
}
