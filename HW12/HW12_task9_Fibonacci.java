package ua.od.fabrika.antonichev.HW12;

/**
 * Определить статический метод для вычисления элементов ряда чисел Фибоначчи,
 * исходя из рекуррентного выражения F(n) = F(n-1) + F(n-2).
 * Метод принимает индекс числа, возвращает значение числа.
 */
public class HW12_task9_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(30));
    }

    public static int fibo(int number){
        if (number == 1 || number == 2) return 1;
        else {
            return fibo(number - 1) + fibo(number - 2);
        }
    }
}
