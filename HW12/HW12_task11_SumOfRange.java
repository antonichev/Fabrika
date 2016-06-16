package ua.od.fabrika.antonichev.HW12;

/**
 * Сумма чисел в диапазоне.
 * Вычислить сумму чисел в определённом диапазоне. Начало и конец диапазона задаётся параметрами.
 */
public class HW12_task11_SumOfRange {
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
    }

    static int sum(int num1, int num2){
        if (num2 == num1) return num1;
        else return num1 + sum(num1 + 1, num2);
    }
}
