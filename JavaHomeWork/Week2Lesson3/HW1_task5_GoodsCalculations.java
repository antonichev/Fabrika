package ua.od.fabrika.antonichev.HW1;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Сколько товара ценой Y можно купить на Х гривен и сколько получить сдачи?
 */
public class HW1_task5_GoodsCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter amount of money (UAH): ");
        BigDecimal money = input.nextBigDecimal();

        System.out.println("Please enter price of goods (UAH): ");
        BigDecimal price = input.nextBigDecimal();

        if (money.doubleValue() <= 0 || price.doubleValue() <= 0){
            System.out.println("Error! (wrong data)");
        }
        else {

            BigDecimal qty = money.setScale(2).divide(price, BigDecimal.ROUND_DOWN);
            BigDecimal change = money.subtract(qty.multiply(price));

            System.out.println("You can buy " + qty + " units of goods and will get " + (change.equals(0) ? "no change" : change + " UAH of change"));
        }
    }
}
