package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры стоимость одного ноутбука,
 * их количество и процент скидки. Посчитать общую сумму заказа.
 */
public class HW3_task9_Notebooks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter price of one laptop (UAH):");
        float priceForOne = input.nextFloat();

        System.out.println("Enter quantity of laptops (UAH):");
        int qty = input.nextInt();

        System.out.println("Enter discount (%):");
        double discount = (double) input.nextInt() / 100;

        if (priceForOne <= 0 || qty <= 0 || discount < 0){
            System.out.println("Error! Wrong data");
        }
        else {
            double amount = priceForOne * qty;

            double grandTotal = amount - amount * discount;

            System.out.println("Total amount: " + grandTotal + " UAH");
        }
    }
}
