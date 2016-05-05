package ua.od.fabrika.antonichev.HW5;

import java.util.Scanner;

/**
 * Написать игру «Угадай число». Пользователь мысленно загадывает число
 * от 0 до 1000, компьютер отгадывает его за минимальное количество попыток.
 */
public class HW5_task12_GuessTheNumber {
    public static void main(String[] args) {
        int x = 500, min = 0, max = 1000;

        Scanner input = new Scanner(System.in);

        System.out.println("Pick one number from 1 to 1000");

        boolean correct = false;

        int count = 1;

        while (!correct){
            System.out.println("Maybe it's " + x + "?");
            System.out.println("1. No, my number is bigger");
            System.out.println("2. No, my number is smaller");
            System.out.println("3. Yes");

            int choice = input.nextInt();

            switch (choice){
                case 1:
                    min = x;
                    count++;
                    break;
                case 2:
                    max = x;
                    count++;
                    break;
                case 3:
                    correct = true;
                    count++;
                    break;
                default:
                    System.out.println("Incorrect choice. Try again");
                    break;
            }
            x = (max + min) / 2;
        }

        if (correct) System.out.println("Your number is " + x + ". Guessed within " + count + " attempts");
    }
}
