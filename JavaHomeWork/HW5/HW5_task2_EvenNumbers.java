package ua.od.fabrika.antonichev.HW5;

/**
 * Написать программу, выводящую на экран только
 * четные целые числа из диапазона от 1 до 100.
 */
public class HW5_task2_EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
