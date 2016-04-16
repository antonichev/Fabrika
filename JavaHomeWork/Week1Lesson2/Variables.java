public class Variables {

    public static void main(String[] args) {

        int side_a = 10, side_b = 15, diam = 20;
        double pi = 3.14;
        //1. Дана сторона квадрата a. Найти его периметр P = 4•a
        System.out.println("P = " + side_a * 4 + "\n");

        //2. Дана сторона квадрата a. Найти его площадь S = a^2
        System.out.println("S = " + Math.pow(side_a, 2) + "\n");

        //3. Даны стороны прямоугольника a и b. Найти его площадь S=a•b и периметр P = 2•(a + b)
        System.out.println("S = " + side_a * side_b + ",\n" + "P = " + 2 * (side_a + side_b) + "\n");

        //4. Дан диаметр окружности d. Найти ее длину L = π•d. В качестве значения π использовать 3.14
        System.out.println("L = " + pi * diam);
    }
}
