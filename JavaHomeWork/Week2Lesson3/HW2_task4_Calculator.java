package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Реализовать калькулятор. Вводятся 2 любых вещественных числа в переменные a и b.
 * Необходимо вывести на экран меню с пунктами:
 *1) a + b
 *2) a – b
 *3) a * b
 *4) a / b
 *5) a % b
 * При выборе соответствующего пункта меню происходит вывод результата вычисления
 * (должна быть проверка деления на 0!)
 */
public class HW2_task4_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 'a': ");
        int a = input.nextInt();

        System.out.println("Please enter 'b': ");
        int b = input.nextInt();

        System.out.println("\nChoose the operation: \n1) a + b\n2) a – b\n3) a * b\n4) a / b\n5) a % b");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (double) a * b);
                break;
            case 4:
                if (b == 0){
                    System.out.println("Error (divisor is zero)");
                }
                else {
                    System.out.println("Result: " + (double) a / b);
                }
                break;
            case 5:
                if (b == 0){
                    System.out.println("Error (divisor is zero)");
                }
                else {
                    System.out.println("Result: " + a % b);
                }
                break;
            default:
                System.out.println("Error! (wrong choice)");
                break;
        }
    }
}
