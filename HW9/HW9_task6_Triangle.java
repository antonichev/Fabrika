package ua.od.fabrika.antonichev.HW9;

/**
 * Описать класс «triangle». В качестве свойств возьмите длинны сторон треугольника.
 * Реализуйте метод который будет возвращать площадь этого треугольника
 * Создайте несколько объектов этого класса и протестируйте их.х.
 */
public class HW9_task6_Triangle {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();

        triangle1.a_side = 10;
        triangle1.b_side = 10;
        triangle1.c_side = 10;

        System.out.println(triangle1.square());

        Triangle triangle2 = new Triangle();

        triangle2.a_side = 50;
        triangle2.b_side = 35;
        triangle2.c_side = 77;

        System.out.println(triangle2.square());
    }
}

class Triangle{
    int a_side;
    int b_side;
    int c_side;

    public double square(){
        double semiperimeter = (a_side + b_side + c_side) / 2;

        return Math.sqrt(semiperimeter * (semiperimeter - a_side) * (semiperimeter - b_side) * (semiperimeter - c_side));
    }
}
