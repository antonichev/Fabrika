package ua.od.fabrika.antonichev.HW4;

import java.util.Scanner;

/**
 * Ввести любую дату (день, месяц и год вводятся по отдельности).
 * Проверить корректность введённых значений. Вывести дату следующего дня
 * (использовать стандартные встроенные классы Java вроде
 * GregorianCalendar запрещено!)
 */
public class HW4_task9_Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = input.nextInt();

        System.out.println("Enter month:");
        int month = input.nextInt();

        System.out.println("Enter day:");
        int day = input.nextInt();

        if (year <= 0 || month <= 0 || month > 12 || day <= 0 || day > 31){
            System.out.println("Error! Wrong data");
        }
        else {
            if (day > daysInMonth(year, month)){
                System.out.println("Incorrect day");
            }
            else {
                String nextDay = "";

                if (day + 1 <= daysInMonth(year, month)){
                    nextDay = (day + 1) + "/" + month + "/" + year;
                }
                else {
                    day = 1;
                    if (month + 1 > 12) {
                        month = 1;
                        year++;
                    }
                    else {
                        month++;
                    }
                    nextDay = day + "/" + month + "/" + year;
                }

                System.out.println("Date is correct. On next day date will be " + nextDay);
            }
        }
    }

    public static int daysInMonth(int year, int month){
        int maxDays = 0;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            maxDays = 31;
        }
        else {
            if (month == 4 || month == 6 || month == 9 || month == 11){
                maxDays = 30;
            }
            else {
                if (year % 4 == 0) maxDays = 29;
                else maxDays = 28;
            }
        }
        return maxDays;
    }
}
