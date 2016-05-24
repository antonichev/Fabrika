package ua.od.fabrika.antonichev.HW6;

/**
 * Создать символьный массив из 100 случайных элементов.
 * Определить, сколько в нём цифр, букв и знаков пунктуации.
 */
public class HW6_task4_ArrayOfChars {
    public static void main(String[] args) {

        int sizeOfArray = 100;

        int min = 32;
        int max = 122;

        char[] charArray = new char[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++){
            charArray[i] = (char) (Math.random() * (max - min) + min);
        }

        for (int i = 0; i < charArray.length; i++) {
            if (((int) charArray[i] > 64 && (int) charArray[i] < 91) || ((int) charArray[i] > 96 && (int) charArray[i] < 123)){
                System.out.println(charArray[i] + " - It is a letter");
            }
            else {
                if ((int) charArray[i] > 47 && (int) charArray[i] < 58) System.out.println(charArray[i] + " - It is a digit");
                else System.out.println(charArray[i] + " - It is a punctuation mark");
            }
        }
    }
}
