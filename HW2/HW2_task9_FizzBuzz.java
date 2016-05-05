package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * FizzBuzz origin. Ввести число. Если число:
 *a. Кратно 3 и 5, вывести FizzBuzz
 *b. Кратно 3, вывести Fizz
 *c. Кратно 5, вывести Buzz
 */
public class HW2_task9_FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int number = input.nextInt();

        String fizzBuzz = "";

        if (number % 3 == 0){
            fizzBuzz += "Fizz";
        }
        if (number % 5 == 0){
            fizzBuzz += "Buzz";
        }
        System.out.println(fizzBuzz);
    }
}
