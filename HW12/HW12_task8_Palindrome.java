package ua.od.fabrika.antonichev.HW12;

import java.util.Scanner;

/**
 * Дано слово, состоящее только из строчных латинских букв.
 * Проверьте, является ли это слово палиндромом. Выведите YES или NO.
 * При решении этой задачи нельзя пользоваться циклами.
 * Ввод: radar yes
 * Вывод: YES NO
 */
public class HW12_task8_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter word:");
        String string = input.nextLine();

        if (string.length() == 0) System.out.println("Error! Wrong data");
        else {
            System.out.println(recursion(string));
        }
    }
    static String recursion(String string){
        if (string.length() == 1) {
            return "YES";
        } else {
            if (string.substring(0, 1).equals(string.substring(string.length() - 1, string.length()))) {
                if (string.length() == 2) {
                    return "YES";
                }
                return recursion(string.substring(1, string.length() - 1));
            } else {
                return "NO";
            }
        }
    }
}
