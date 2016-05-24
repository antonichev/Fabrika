package ua.od.fabrika.antonichev.HW6;

import java.util.Scanner;

/**
 * Ввести число в диапазоне от 0 до 1000000. Озвучить его словами.
 * Например, при вводе числа 25 вывести на экране «двадцать пять».
 */
public class HW6_task21_DigitByWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] arrayOfWords = {"zero", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ",
                                "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen ",
                                "twenty ", "", "", "", "", "", "", "", "", "",
                                "thirty ", "", "", "", "", "", "", "", "", "",
                                "forty ", "", "", "", "", "", "", "", "", "",
                                "fifty ", "", "", "", "", "", "", "", "", "",
                                "sixty ", "", "", "", "", "", "", "", "", "",
                                "seventy ", "", "", "", "", "", "", "", "", "",
                                "eighty ", "", "", "", "", "", "", "", "", "",
                                "ninety ", "", "", "", "", "", "", "", "", ""};


        System.out.println("Enter value from 0 to 1000000:");
        int value = input.nextInt();

        if (value < 0 || value > 1000000){
            System.out.println("Error! Wrong data");
        }
        else {
            String outString = "";

            int firstPart = 0;

            if (value == 0) {
                outString = "zero";
            }
            if (value == 1000000) {
                outString = "one million";
            }
            else {

                int lengthOfValue = String.valueOf(value).length();

                switch (lengthOfValue){
                    case 1:
                        outString = arrayOfWords[value];
                        break;
                    case 2:
                        if (value <= 20){
                            outString = arrayOfWords[value];
                        }
                        else {
                            outString = arrayOfWords[value / 10 * 10] + arrayOfWords[value % 10];
                        }
                        break;
                    case 3:
                        outString = arrayOfWords[value / 100] + "hundred ";

                        value -= value / 100 * 100;

                        if (value <= 20){
                            outString += arrayOfWords[value];
                        }
                        else {
                            outString += arrayOfWords[value / 10 * 10] + arrayOfWords[value % 10];
                        }
                        break;
                    case 4:
                        outString = arrayOfWords[value / 1000] + "thousand ";

                        value -= value / 1000 * 1000;

                        outString += arrayOfWords[value / 100] + "hundred ";

                        value -= value / 100 * 100;

                        if (value <= 20){
                            outString += arrayOfWords[value];
                        }
                        else {
                            outString += arrayOfWords[value / 10 * 10] + arrayOfWords[value % 10];
                        }
                        break;
                    case 5:
                        firstPart = value / 1000;

                        value %= 1000;

                        if (firstPart <= 20){
                            outString += arrayOfWords[firstPart] + "thousand ";
                        }
                        else {
                            outString += arrayOfWords[firstPart / 10 * 10] + arrayOfWords[firstPart % 10] + "thousand ";
                        }

                        outString += arrayOfWords[value / 100] + "hundred ";

                        value -= value / 100 * 100;

                        if (value <= 20){
                            outString += arrayOfWords[value];
                        }
                        else {
                            outString += arrayOfWords[value / 10 * 10] + arrayOfWords[value % 10];
                        }
                        break;
                    case 6:
                        firstPart = value / 1000;

                        value %= 1000;

                        outString += arrayOfWords[firstPart / 100] + "hundred ";

                        firstPart -= firstPart / 100 * 100;

                        if (firstPart <= 20){
                            outString += arrayOfWords[firstPart] + "thousand ";
                        }
                        else {
                            outString += arrayOfWords[firstPart / 10 * 10] + arrayOfWords[firstPart % 10] + "thousand ";
                        }

                        outString += arrayOfWords[value / 100] + "hundred ";

                        value -= value / 100 * 100;

                        if (value <= 20){
                            outString += arrayOfWords[value];
                        }
                        else {
                            outString += arrayOfWords[value / 10 * 10] + arrayOfWords[value % 10];
                        }
                        break;
                    default:
                        outString = "Error!";
                        break;
                }
            }
            System.out.println("Result: " + outString);
        }
    }
}
