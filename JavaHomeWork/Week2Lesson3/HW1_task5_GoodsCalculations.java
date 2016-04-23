package ua.od.fabrika.antonichev.HW1;

/**
* Сколько товара ценой Y можно купить на Х гривен и сколько получить сдачи?
*/

import java.util.Scanner;

public class HW1_task5_GoodsCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter amount of money (UAH): ");
        double money = input.nextDouble();

        System.out.println("Please enter price of goods (UAH): ");
        double price = input.nextDouble();

        if (money <= 0 || price <= 0){
            System.out.println("Error! (wrong data)");
        }
        else {

            double qty = Math.round(money / price * 100.0) / 100.0;
            double change = money - qty * price;

            change = Math.round(change * 100.0) / 100.0;

            System.out.println("You can buy " + qty + " units of goods and will get " + (change == 0 ? "no change" : change + " UAH of change"));
        }
    }
}
