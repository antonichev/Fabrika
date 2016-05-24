package ua.od.fabrika.antonichev.HW8;

import java.util.Scanner;

/**
 * Написать метод countChars, который получает String и char в качестве параметра.
 * Функция должна посчитать и вернуть количество вхождений символа в строку.
 */
public class HW8_task1_countChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string:");
        String strng = input.nextLine();

        System.out.println("Enter char:");
        String chrString = input.nextLine();

        System.out.println("Char " + chrString.charAt(0) + ": found " + countChars(strng, chrString.charAt(0)) + " time(s)");
    }

    public static int countChars(String strng, char chr){
        int count = 0;

        char[] temp = strng.toCharArray();

        for (int i = 0; i < temp.length; i++){
            if (temp[i] == chr){
                count++;
            }
        }

        return count;
    }
}
