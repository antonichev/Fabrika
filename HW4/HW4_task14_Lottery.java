package ua.od.fabrika.antonichev.HW4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Реализовать программу-лотерею. Программа загадывает 5
 * (неповторяющихся) чисел в диапазоне от 1 до 42, но не
 * показывает их на экран. Пользователь пытается их угадать –
 * вводит каких-то 5 чисел с клавиатуры. Назначить призы за совпадение.
 * Например, если пользователь угадал три числа - приз 300 гривен,
 * если 4 - 4000 гривен, если 5 – 50000 гривен.
 * И в целом, какова вероятность того, что пользователь угадает все 5 чисел?
 */

//«a из n» : P = (a!*(n-a)!) / n!


public class HW4_task14_Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList(5);

        Random random = new Random();

        while (numbers.size() < 5){
            int num = random.nextInt(42) + 1;
            if (!numbers.contains(num)){
                numbers.add(num);
            }
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter five different numbers from 1 to 42");

        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        if (num1 > 0 && num1 < 43){
            System.out.println("Enter second number:");
            int num2 = input.nextInt();

            if ((num2 > 0 && num2< 43) && (num1 != num2)){
                System.out.println("Enter third number:");
                int num3 = input.nextInt();

                if ((num3 > 0 && num3< 43) && (num3 != num2 && num3 != num1)){

                    System.out.println("Enter forth number:");
                    int num4 = input.nextInt();

                    if ((num4 > 0 && num4< 43) && (num4 != num3 && num4 != num2 && num4 != num1)){

                        System.out.println("Enter fifth number:");
                        int num5 = input.nextInt();

                        if ((num5 > 0 && num5< 43) && (num5 != num4 && num5 != num3 && num5 != num2 && num5 != num1)){
                               equalization(num1, num2, num3, num4, num5, numbers);
                        }
                        else System.out.println("Error! Incorrect number");
                    }
                    else System.out.println("Error! Incorrect number");
                }
                else System.out.println("Error! Incorrect number");
            }
            else System.out.println("Error! Incorrect number");
        }
        else System.out.println("Error! Incorrect number");
    }

    public static void equalization(int num1, int num2, int num3, int num4, int num5, ArrayList numbers){
        int shot = 0;

        if (numbers.contains(num1)) shot++;
        if (numbers.contains(num2)) shot++;
        if (numbers.contains(num3)) shot++;
        if (numbers.contains(num4)) shot++;
        if (numbers.contains(num5)) shot++;

        if (shot < 3){
            System.out.println("You guessed " + shot + " number(s). Sorry, but no prize for you");
        }
        else {
            if (shot == 3){
                System.out.println("You guessed 3 numbers. You won 300 points");
            }
            if (shot == 4){
                System.out.println("You guessed 4 numbers. You won 4000 points");
            }
            if (shot == 5){
                System.out.println("You guessed 5 numbers (are you telepathic???). You won 50000 points");
            }
        }
    }
}
