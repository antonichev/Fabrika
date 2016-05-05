package ua.od.fabrika.antonichev.HW4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

/**
 * Какой-то чувак купил N куриц по M гривен за одну курицу.
 * Каждая курица несёт по X яиц в неделю. Чувак решил открыть
 * свой бизнес и стал продавать яйца, которые несут курицы.
 * За сколько дней окупятся куры, если продавать яйца по Z гривен за десяток
 * (с учётом НДС, но без учёта сбора в ПФ)? Сроком жизни куриц, влажностью
 * воздуха в курятнике, а также скоростью ветра и фазами луны можно пренебречь.
 */
public class HW4_task16_DudeWithChickens {
    public static void main(String[] args) {
        double pf = 0.05;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity of hens:");
        int hens = input.nextInt();

        System.out.println("Enter price for one hens:");
        double henPrice = input.nextDouble();

        System.out.println("Enter quantity of eggs that one hen lays per week:");
        int eggs = input.nextInt();

        System.out.println("Enter price for ten eggs:");
        double price = input.nextDouble();

        if (hens <= 0 || henPrice <= 0 || eggs <= 0 || price <= 0) System.out.println("Error! Wrong data");
        else {
            double totalAmount = hens * henPrice;
            price += price * pf;

            price /= 10;

            int totalEggsPerWeek = hens * eggs;
            double sumForEggsPerDay = totalEggsPerWeek * price / 7;

            double days = totalAmount / sumForEggsPerDay;

            int finDays = (int) days;
            if (days - finDays > 0) finDays++;

            System.out.println("All hens will pay off within " + finDays + " day(s)");
        }
    }
}
