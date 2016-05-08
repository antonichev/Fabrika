package ua.od.fabrika.antonichev.HW3;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры объем одного фильма в гигабайтах.
 * Посчитать, сколько дискет понадобится для переноса фильма на другой
 * компьютер (размер дискеты считать равным 1.44 Мбайт).
 */
public class HW3_task15_FDD {
    public static void main(String[] args) {
        double diskSize = 1.44;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter volume of one movie (Gb):");
        double volume = input.nextDouble() * 1024;

        if (volume <= 0){
            System.out.println("Error! Wrong data");
        }
        else {
            double qty = volume / diskSize;

            System.out.println("For this hardcore you'll need " + (qty - Math.round(qty) > 0.000000001 ? Math.round(qty) + 1 : Math.round(qty)) + " diskettes");
        }
    }
}
