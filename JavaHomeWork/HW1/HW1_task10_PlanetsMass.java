package ua.od.fabrika.antonichev.HW1;

import java.math.BigDecimal;

/**
 * Рассчитать общую массу всех планет Солнечной системы. Вычислить среднее арифметическое масс планет.
 * Затем - массу каждой планеты в процентном соотношении, если принять за 100% общую массу всех планет.
 * Во сколько раз масса самой крупной планеты больше чем сумма масс всех остальных планет?
 * Все результаты – показать на экране.
 * Рекомендуется использование типа BigDecimal.
 */
public class HW1_task10_PlanetsMass {
    public static void main(String[] args) {
        //http://www.universetoday.com/34024/mass-of-the-planets/
        BigDecimal mercury = new BigDecimal(0.330e24);
        BigDecimal venus = new BigDecimal(4.87e24);
        BigDecimal earth = new BigDecimal(5.98e24);
        BigDecimal mars = new BigDecimal(0.642e24);
        BigDecimal jupiter = new BigDecimal(1900e24);
        BigDecimal saturn = new BigDecimal(569e24);
        BigDecimal uranus = new BigDecimal(86.8e24);
        BigDecimal neptune = new BigDecimal(102e24);

        BigDecimal total_mass = mercury.add(venus.add(earth.add(mars.add(jupiter.add(saturn.add(uranus.add(neptune)))))));

        System.out.println("Total mass of all planet: " + total_mass);

        System.out.println("Arithmetic average of all planet: " + total_mass.divide(new BigDecimal(8)));

        System.out.println("Percentage ratio of Mercury: " + mercury.setScale(3).multiply(new BigDecimal("100")).divide(total_mass, BigDecimal.ROUND_HALF_UP));
        System.out.println("Percentage ratio of Venus: " + venus.setScale(3).multiply(new BigDecimal("100")).divide(total_mass, BigDecimal.ROUND_HALF_UP));
        System.out.println("Percentage ratio of Earth: " + earth.setScale(3).multiply(new BigDecimal("100")).divide(total_mass, BigDecimal.ROUND_HALF_UP));
        System.out.println("Percentage ratio of Mars: " + mars.setScale(3).multiply(new BigDecimal("100")).divide(total_mass, BigDecimal.ROUND_HALF_UP));
        System.out.println("Percentage ratio of Jupiter: " + jupiter.setScale(3).multiply(new BigDecimal("100")).divide(total_mass, BigDecimal.ROUND_HALF_UP));
        System.out.println("Percentage ratio of Saturn: " + saturn.setScale(3).multiply(new BigDecimal("100")).divide(total_mass, BigDecimal.ROUND_HALF_UP));
        System.out.println("Percentage ratio of Uranus: " + uranus.setScale(3).multiply(new BigDecimal("100")).divide(total_mass, BigDecimal.ROUND_HALF_UP));
        System.out.println("Percentage ratio of Neptune: " + neptune.setScale(3).multiply(new BigDecimal("100")).divide(total_mass, BigDecimal.ROUND_HALF_UP));

        System.out.println("Jupiter in " + jupiter.subtract(total_mass).abs() + " times bigger then other planets");
    }
}
