package ua.od.fabrika.antonichev.HW1;

/**
 * Задано целое число в бинарном виде. Реализовать циклический сдвиг битов вправо аналогично
 * примеру, разобранному в классе (смотрите в примерах кода).
 */

public class HW1_task12_BinaryShift {
    public static void main(String[] args) {
        int number = 0b10101110_11101111_00100000_10001110;
        System.out.println("Current number is " + number + " = " + Integer.toBinaryString(number) );

        int newNumber = (number >>> 31) + (number >> 2);
        System.out.println(Integer.toBinaryString(number >> 2));
        System.out.println(Integer.toBinaryString(number >>> 31));
        System.out.println( "New number is " + newNumber + " = " + Integer.toBinaryString(newNumber) );
    }
}
