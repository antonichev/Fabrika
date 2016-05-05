package ua.od.fabrika.antonichev.HW4;

import java.util.Random;
import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры количество градусов по Цельсию,
 * которое соответствует предполагаемой температуре за окном.
 * Программа сообщает, тепло сейчас или холодно, жарко или мороз, а также
 * генерирует прогноз погоды на завтра, с указанием скорости ветра,
 * возможных осадков и температуры воды в Чёрном море (по некоторой придуманной Вами логике).
 */
public class HW4_task12_WeatherForecast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature, °C:");
        int temp = input.nextInt();

        if (temp > 60 || temp < -278){
            System.out.println("It's armageddon time!");
        }
        else {
            if(temp > 0 && temp <= 10){
                System.out.println("It's cold");
                forecast(temp);
            }
            if(temp > 10 && temp <= 25){
                System.out.println("It's warm");
                forecast(temp);
            }
            if(temp > 25 && temp <= 35){
                System.out.println("It's hot");
                forecast(temp);
            }
            if(temp > 35 && temp <= 60){
                System.out.println("It's very hot");
                forecast(temp);
            }
            if(temp > -25 && temp <= 0){
                System.out.println("It's very cold");
                forecast(temp);
            }
            if(temp > -55 && temp <= -25){
                System.out.println("It's really freeze outside");
                forecast(temp);
            }
            if(temp >= -100 && temp <= -55){
                System.out.println("AAA!!!");
                forecast(temp);
            }
        }
    }

    public static void forecast(int temp){

        Random random = new Random();
        int wind = random.nextInt(20);
        int humidity = random.nextInt(100);

        if (temp >= 0){
            temp += random.nextInt(10);
        }
        else
        {
            temp -= random.nextInt(10);
        }

        int seaTemp = 0;
        if (temp <= 0){
            seaTemp = -1 * random.nextInt(8);
        }
        else{
            seaTemp = random.nextInt(temp);
        }

        boolean rain;

        if (humidity > 80) rain = true;
        else rain = false;

        System.out.println("Weather forecast fo tomorrow:");
        System.out.println("Air temp: " + temp + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Precipitation: " + (rain ? "yes" : "no"));
        System.out.println("Temperature of Black Sea: " + seaTemp + "°C");
    }
}
