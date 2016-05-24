package ua.od.fabrika.antonichev.HW6;

import java.util.Arrays;

/**
 * Создать массив строк на 4000 элементов. Заполнить его римскими
 * числами от 1 до 3999, показать на экране все элементы.
 */
public class HW6_task20_RomanNumerals {
    public static void main(String[] args) {
        int sizeOfArray = 4000;

        String[] myArray = new String[sizeOfArray];

        int[]    numbersArray  = {  1,   4,   5,    9,   10,  40,   50,  90,    100,  400,  500,  900,  1000, 4000 };

        String[] lettersArray  = { "I", "IV", "V", "IX", "X", "XL", "L", "XC",  "C",  "CD", "D",  "CM", "M", "MMMM" };

        for (int i = 0; i < myArray.length; i++){

            int currArabNum = i + 1;

            if (currArabNum > 3999) continue;

            String currRomNum = "";

            while (currArabNum > 0){
                for (int j = 0; j <= numbersArray.length; j++){
                    if (currArabNum < numbersArray[j]) {

                        currArabNum -= numbersArray[j - 1];
                        currRomNum += lettersArray[j - 1];

                        break;
                    }
                }
            }
            myArray[i] = currRomNum;
        }

        for (int i = 0; i < myArray.length; i++){
            System.out.println((i + 1) + "\t = " + myArray[i]);
        }

    }
}
