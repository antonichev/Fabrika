package ua.od.fabrika.antonichev.HW12;

/**
 * Вычислить степень числа, используя рекурсию.
 * В статический метод передаётся 2 параметра - число и степень.
 */
public class HW12_task10_Power {
    public static void main(String[] args) {
        System.out.println(power(10, 5));
    }

    public static int power(int number, int power){
        power--;
        if (power == 0) return number;
        else {
            power++;
            return number * power(number, power - 1);
        }
    }
}
