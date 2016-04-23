package ua.od.fabrika.antonichev.HW1;

/**
 * Ввести длину, ширину и высоту комнаты. Подсчитать, сколько краски уйдет на покраску
 * стен этой комнаты, если на 1м2 стены приходится N литров краски и M% поверхности
 * стен занимают окна и двери. Также, рассчитать общую стоимость краски, с учётом того,
 * что один литр краски стоит R гривен.
 */

import java.util.Scanner;

public class HW1_task7_PaintConsumption {
    public static void main(String[] args) {

        double cons = 0.12; //Consumption of paint per sq m
        double length, height, width, door_window, price, liters, cash;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter length of the room (m):");
        length = input.nextDouble();

        System.out.println("Please enter height of the room (m):");
        height = input.nextDouble();

        System.out.println("Please enter width of the room (m):");
        width = input.nextDouble();

        System.out.println("Please enter how much % takes door and windows:");
        door_window = input.nextDouble();

        System.out.println("Please enter price of paint (UAH):");
        price = input.nextDouble();

        if (length <= 0 || height <= 0 || width <= 0){
            System.out.println("Error! (incorrect data)");
        }
        else {
            double total_square = 2 * length * height + 2 * width * height;
            total_square -= total_square * door_window / 100;

            liters = total_square * cons;

            cash = liters * price;

            System.out.println("For this room you'll need " + liters + " ltr of paint, it will cost you " + cash + " UAH");
        }
    }
}
