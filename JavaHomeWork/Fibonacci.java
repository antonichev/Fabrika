package ua.od.fabrika.antonichev;

/**
* Попытка получить ряд Фибоначчи
*/


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number (less than 22): ");
        int num = input.nextInt();

        if(num <= 22){
            int current = 1, last = 1;

            for(int count = 1; count <= num; count++){
                last += current;
                System.out.print(" " + current + " " + last);
                current += last;
            }
        }
        else {
            System.out.println("Number is too big...");
        }
    }
}
