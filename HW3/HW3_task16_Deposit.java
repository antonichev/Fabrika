package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры сумму в гривнах,
 * срок вклада в месяцах и процентную ставку за год.
 * Посчитать, сколько денег будет у пользователя в конце срока.
 */
public class HW3_task16_Deposit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount of money (UAH):");
        double amount = input.nextDouble();

        System.out.println("Enter quantity of months:");
        int months = input.nextInt();

        System.out.println("Enter interest rate per year (%):");
        double interestPerMonth = (double) input.nextInt() / 100 / 12;

        if (amount <= 0 || months <= 0 || interestPerMonth <= 0){
            System.out.println("You'd entered incorrect data!");
        }
        else {
            double total = amount + amount * months * interestPerMonth;
            total = Math.round(total * 100.0) / 100.0;
            System.out.println("At the end you'll got " + total + " UAH");
        }
    }
}
