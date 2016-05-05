package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * Королю нужно убить дракона, но средства его казны – ограничены.  Нужно создать программу,
 * которая поможет рассчитать минимальное количество копейщиков, которое необходимо, чтобы убить дракона.
 * Данные очков здоровья и атаки дракона и одного копейщика вводятся с клавиатуры. Защиту, удачу, мораль,
 * меткость и т.п. не учитывать. Копейщики наносят удар первыми (общий нанесённый урон – это сумма атак всех
 * живых копейщиков). Если атака дракона превышает значение очков копейщика
 * (например, у копейщика хп 10, а атака дракона - 15),  то копейщик погибает, а оставшийся урон действует на
 * оставшихся в живых копейщиков. Например, жизнь дракона 500, атака 55, жизнь одного копейщика 10, атака 10,
 * а количество копейщиков - 20.
 *
 * Лог боя для данного примера должен выглядеть так:
 * - Копейщики атакуют (урон 200) – у дракона осталось 300 очков здоровья.
 * - Дракон атакует (урон 55) – осталось 15 копейщиков, один из которых ранен (осталось 5 очков здоровья).
 * - Копейщики атакуют (урон 150) – у дракона осталось 150 очков здоровья.
 * - Дракон атакует (урон 55) – осталось 9 копейщиков.
 * - Копейщики атакуют (урон 90) – у дракона осталось 60 очков здоровья.
 * - Дракон атакует (урон 55) – осталось 4 копейщика, один из которых ранен (осталось 5 жизней).
 * - Копейщики атакуют (урон 40) – у дракона осталось 20 очков здоровья.
 * - Дракон атакует  и побеждает.
 */
public class HW5_task16_KillTheDragon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Укажите очки здоровья (для одного копейщика):");
        int kopHP = input.nextInt();

        System.out.println("Укажите очки урона (для одного копейщика):");
        int kopDamage = input.nextInt();

        System.out.println("Укажите очки здоровья (для дракона):");
        int inDragonHP = input.nextInt();

        System.out.println("Укажите очки урона (для дракона):");
        int dragonDamage = input.nextInt();

        if (kopHP <= 0 || kopDamage <= 0 || inDragonHP <= 0 || dragonDamage <= 0) {
            System.out.println("Ошибка! Введены некорректные данные");
        }
        else {
            boolean isDragonAlive = true;

            for (int kopQty = 1; isDragonAlive; kopQty++){
                int tempKopQty = kopQty;
                int dragonHP = inDragonHP;
                int totalKopHP = kopHP * kopQty;

                System.out.println("-=-=-= Новая попытка (кол-во: " + kopQty + ") =-=-=-");

                while (tempKopQty > 0 && dragonHP > 0){
                    int totalDamKop = tempKopQty * kopDamage;

                    dragonHP -= totalDamKop;
                    System.out.println("Копейщики атакуют (урон " + totalDamKop + ") – у дракона осталось " + dragonHP + " очков здоровья");

                    if (dragonHP <= 0){
                        break;
                    }
                    else {
                        int i = dragonDamage;
                        int remPoints = 0;

                        totalKopHP -= i;

                        tempKopQty = totalKopHP / kopHP;

                        remPoints = totalKopHP % kopHP;

                        if (remPoints > 0) tempKopQty++;

                        if (totalKopHP / kopHP > 0) {
                            System.out.println("Дракон атакует (урон " + dragonDamage + ") – осталось " + tempKopQty + " копейщиков" +
                                    (remPoints > 0 ? ", один из которых ранен (осталось " + remPoints + " очков здоровья)" : ""));
                        }
                    }
                }

                if (dragonHP <= 0) {
                    System.out.println("******************************************");
                    System.out.println("Победа! Понадобилось " + kopQty + " копейщик(-а, -ов)");
                    System.out.println("******************************************");
                    isDragonAlive = false;
                    break;
                }
                else {
                    System.out.println("Дракон атакует и побеждает");
                }
            }
        }
    }
}
