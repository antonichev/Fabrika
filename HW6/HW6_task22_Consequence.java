package ua.od.fabrika.antonichev.HW6;

import java.util.Scanner;

/**
 * Дана последовательность: 1, 11, 21, 1211, 111221, 312211, 13112221, …
 * Ввести число N. Показать N-ный по счёту элемент последовательности.
 */
public class HW6_task22_Consequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter N:");
        int value = input.nextInt();

        String output = "1";

        if (value <= 0) System.out.println("Error! Wrong data");
        else {

            for (int i = 1; i <= value; i++){
                String result = "";

                char repeat = output.charAt(0);
                output = output.substring(1) + " ";
                int times = 1;

                for(char actual : output.toCharArray()){
                    if(actual != repeat){
                        result += times + "" + repeat;
                        times = 1;
                        repeat = actual;
                    }else{
                        times += 1;
                    }
                }
                output = result;
            }
        }

        System.out.println("Result: " + output);
    }
}

