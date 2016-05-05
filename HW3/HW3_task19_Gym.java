package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * В зале у главного тренера Вячеслава занимается N спортсменов.
 * Каждому из них Вячеслав в конце тренировки выдаёт 1 порцию гейнера,
 * а если вес спортсмена менее 80 кг - то дополнительно ещё 1 порцию гейнера и стакан молока.
 * Стакан молока имеет ёмкость 200 мл, а упаковка молока – 0.9 л.
 * Написать программу, которая определит количество пакетов молока и порций гейнера,
 * необходимых тренеру каждый день, для двух условий:
 * а) если в зале 100% всех спортсменов - дрищи (вес меньше 80 кг)
 * б) если в зале 60% всех спортсменов - дрищи (вес меньше 80 кг)
 */
public class HW3_task19_Gym {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity of sportsmen:");
        int sportsmen = input.nextInt();

        if (sportsmen <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            //а) если в зале 100% всех спортсменов - дрищи (вес меньше 80 кг)
            PrintOut(1.0, sportsmen, "100% of liteweighters");

            //б) если в зале 60% всех спортсменов - дрищи (вес меньше 80 кг)
            PrintOut(0.6, sportsmen, "60% of liteweighters");
        }
    }

    public static void PrintOut(double liteweight, int sportsmen, String variant){
        int packOfMilk = 900;
        int glassOfMilk = 200;
        double glassesInPack = (double) packOfMilk / glassOfMilk;

        int litePersons = (int) Math.round(sportsmen * liteweight);
        int normalPersons = sportsmen - litePersons;

        int gainerPortions = normalPersons + litePersons * 2;

        int totalPacks = (int) (litePersons / glassesInPack);

        if (litePersons % glassesInPack > 0) {
            totalPacks++;
        }

        System.out.println("For " + variant + " you'll need " + gainerPortions + " portion(s) of gainer and " + totalPacks + " pack(s) of milk");
    }
}
