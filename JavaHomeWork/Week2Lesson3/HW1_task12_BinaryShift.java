package ua.od.fabrika.antonichev.HW1;

/**
 * Задано целое число в бинарном виде. Реализовать циклический сдвиг битов вправо аналогично
 * примеру, разобранному в классе (смотрите в примерах кода).
 */
public class HW1_task12_BinaryShift {
    public static void main(String[] args) {
        int number = 0b00000000_00000000_00000000_00000011;
        System.out.println("Current number is " + number + " = " + Integer.toBinaryString(number) );

        int newNumber = (number << 30) + (number >> 2);
        System.out.println(Integer.toBinaryString(number >> 2));
        System.out.println(Integer.toBinaryString(number >> 30));
        System.out.println( "New number is " + newNumber + " = " + Integer.toBinaryString(newNumber) );
    }
}
