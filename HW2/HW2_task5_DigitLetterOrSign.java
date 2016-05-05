package ua.od.fabrika.antonichev.HW2;

import java.util.Scanner;

/**
 * Ввести с клавиатуры символ. Определить, чем он является:
 * цифрой, буквой или знаком пунктуации.
 */
public class HW2_task5_DigitLetterOrSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter one symbol (letter, digit or punctuation mark): ");
        String symbol = input.next();

        if (symbol.length() > 1){
            System.out.println("Error (more than one symbol)");
            return;
        }

        //First variant
        boolean isDigit = Character.isDigit(symbol.charAt(0));
        boolean isAlphabetic  = Character.isAlphabetic(symbol.charAt(0));

        if (isDigit){
            System.out.println("It is a digit");
        }
        else {
            if (isAlphabetic){
                System.out.println("It is a letter");
            }
            else {
                System.out.println("It is a punctuation mark");
            }
        }

        //Second variant
        int valueOfC = (int) symbol.charAt(0);

        if ((valueOfC > 64 && valueOfC < 91) || (valueOfC > 96 && valueOfC < 123 )){
            System.out.println("It is a letter");
        }
        else {
            if (valueOfC > 47 && valueOfC < 58){
                System.out.println("It is a digit");
            }
            else{
                System.out.println("It is a punctuation mark");
            }
        }

        //Third variant
         System.out.println(typeOfSymbol(Character.getType(symbol.charAt(0))));
    }

     public static String typeOfSymbol(int value){
        String result = "";

        if (value == 0) result = "UNASSIGNED";
        if (value == 1) result = "UPPERCASE LETTER";
        if (value == 2) result = "LOWERCASE LETTER";
        if (value == 3) result = "TITLECASE LETTER";
        if (value == 4) result = "MODIFIER LETTER";
        if (value == 5) result = "OTHER LETTER";
        if (value == 6) result = "NON SPACING MARK";
        if (value == 7) result = "ENCLOSING MARK";
        if (value == 8) result = "COMBINING SPACING MARK";
        if (value == 9) result = "DECIMAL DIGIT NUMBER";
        if (value == 10) result = "LETTER NUMBER";
        if (value == 11) result = "OTHER NUMBER";
        if (value == 12) result = "SPACE SEPARATOR";
        if (value == 13) result = "LINE SEPARATOR";
        if (value == 14) result = "PARAGRAPH SEPARATOR";
        if (value == 15) result = "CONTROL";
        if (value == 16) result = "FORMAT";
        if (value == 17) result = "UNASSIGNED";
        if (value == 18) result = "PRIVATE USE";
        if (value == 19) result = "SURROGATE";
        if (value == 20) result = "DASH PUNCTUATION";
        if (value == 21) result = "START PUNCTUATION";
        if (value == 22) result = "END PUNCTUATION";
        if (value == 23) result = "CONNECTOR PUNCTUATION";
        if (value == 24) result = "OTHER PUNCTUATION";
        if (value == 25) result = "MATH SYMBOL";
        if (value == 26) result = "CURRENCY SYMBOL";
        if (value == 27) result = "MODIFIER SYMBOL";
        if (value == 28) result = "OTHER SYMBOL";
        if (value == 29) result = "INITIAL QUOTE PUNCTUATION";
        if (value == 30) result = "FINAL QUOTE PUNCTUATION";

        return result;
    }
}
