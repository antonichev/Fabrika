package ua.od.fabrika.antonichev.HW3;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры дробное число.
 * Округлить его до двух знаков после запятой и вывести на экран.
 */
public class HW3_task12_Round {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter decimal number:");
        BigDecimal number = input.nextBigDecimal();

        if (number.doubleValue() <= 0) System.out.println("Error! Wrong data");
        else System.out.println("Result: " + number.setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}
