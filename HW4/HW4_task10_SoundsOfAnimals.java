package ua.od.fabrika.antonichev.HW4;

import java.util.Scanner;

/**
 * Написать программу, которая предлагает пользователю выбрать животное из списка
 * (1 – кошка, 2 – собака и тд.), и в ответ показывает, какие звуки издаёт
 * выбранное животное. В списке должно быть хотя бы 10 животных.
 */
public class HW4_task10_SoundsOfAnimals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1.  Sounds of cow");
        System.out.println("2.  Sounds of dog");
        System.out.println("3.  Sounds of cat");
        System.out.println("4.  Sounds of pig");
        System.out.println("5.  Sounds of hen");
        System.out.println("6.  Sounds of frog");
        System.out.println("7.  Sounds of duck");
        System.out.println("8.  Sounds of owl");
        System.out.println("9.  Sounds of goat");
        System.out.println("10. Sounds of lion");

        System.out.println("Enter your choice:");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("Cow: moo-moo");
                break;
            case 2:
                System.out.println("Dog: woof-woof");
                break;
            case 3:
                System.out.println("Cat: meow-meow");
                break;
            case 4:
                System.out.println("Pig: oink-oink");
                break;
            case 5:
                System.out.println("Hen: cluck-cluck");
                break;
            case 6:
                System.out.println("Frog: croak-croak");
                break;
            case 7:
                System.out.println("Duck: quack-quack");
                break;
            case 8:
                System.out.println("Olw: hoot-hoot");
                break;
            case 9:
                System.out.println("Goat: bleat-bleat");
                break;
            case 10:
                System.out.println("Lion: roar-roar");
                break;
            default:
                System.out.println("Error! Wrong choice");
                break;
        }
    }
}
