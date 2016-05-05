package ua.od.fabrika.antonichev.HW3;

import java.math.BigDecimal;

/**
 * Рассчитать площадь поверхности Земли.
 */
public class HW3_task17_EarthArea {
    public static void main(String[] args) {
        int radius = 6371;

        BigDecimal area = new BigDecimal(4 * Math.PI * Math.pow(radius, 2));

        System.out.println("Area of Earth's surface is " + area.intValue() + " sq.km.");
    }
}
