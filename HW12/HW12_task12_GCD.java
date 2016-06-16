package ua.od.fabrika.antonichev.HW12;

/**
 * Написать рекурсивный статический метод нахождения наибольшего общего делителя двух целых чисел.
 */
public class HW12_task12_GCD {
    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
    }

    static int gcd(int a, int b){
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
