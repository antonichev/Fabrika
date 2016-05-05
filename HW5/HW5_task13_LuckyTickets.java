package ua.od.fabrika.antonichev.HW5;

/**
 * Показать номера и общее количество всех счастливых
 * трамвайных билетов с шестизначными номерами.
 */
public class HW5_task13_LuckyTickets {
    public static void main(String[] args) {
        int firstPart, secondPart, qty = 0;

        for (int n = 100000; n <= 999999; n++)
        {
            firstPart = (((n / 100000) % 10) + ((n / 10000) % 10) + ((n / 1000) % 10));
            secondPart = (((n / 100) % 10) + ((n / 10) % 10) + (n % 10));
            if (firstPart == secondPart) {
                System.out.println(n);;
                qty++;
            }
        }
        System.out.println("Quantity of lucky tickets: " + qty);
    }
}
