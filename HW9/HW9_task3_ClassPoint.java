package ua.od.fabrika.antonichev.HW9;

/**
 * Реализовать класс Point, описывающий точку в двумерном (по желанию – в трёхмерном) пространстве.
 * Предусмотреть поля, хранящие координаты по X и Y. Сделать методы, позволяющие переместить точку
 * (например - вверх, вниз, влево, вправо) на указанное количество единиц. И ещё добавить метод,
 * который покажет координаты точки на экране консоли.
 */
public class HW9_task3_ClassPoint {
    public static void main(String[] args) {
        Point point = new Point(0, 0, 0);

        System.out.println(point.coordinates());
        point.moveBackward(5);

        System.out.println(point.coordinates());
        point.moveDown(5);

        System.out.println(point.coordinates());
        point.moveForward(5);

        System.out.println(point.coordinates());
        point.moveLeft(5);

        System.out.println(point.coordinates());
        point.moveUp(5);

        System.out.println(point.coordinates());
        point.moveRight(5);

        System.out.println(point.coordinates());
    }
}

class Point{
    int x;
    int y;
    int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void moveLeft(int units){x -= units;}

    public void moveRight(int units){x += units;}

    public void moveUp(int units){y += units;}

    public void moveDown(int units){y -= units;}

    public void moveForward(int units){z += units;}

    public void moveBackward(int units){z -= units;}

    public String coordinates(){
        return "Point (" + x + "; " + y + "; " + z + ")";
    }
}
