package ua.od.fabrika.antonichev.HW9;

/**
 * Реализовать класс Rectangle. Добавить поля: ширину, высоту и координаты левого верхнего угла (тип Point).
 * Добавить методы вычисления периметра и площади на основе полей.
 * Создать метод рисования этого примитива звёздочками.
 */
public class HW9_task4_Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 10);

        System.out.println("Perimeter = " + rectangle.perimeter());
        System.out.println("Square = " + rectangle.square());

        rectangle.drawRectangle();
    }
}

class Rectangle{
    int width;
    int height;

    Point2D upper_left = new Point2D(0, 0);

    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;

        System.out.println("Coordinates of upper left point is " + upper_left.coordinates());
    }

    public int perimeter(){
        return (width + height) * 2;
    }

    public double square(){
        return (double) width * height;
    }

    public void drawRectangle(){
        for (int h = 0; h < height; h++) {
            System.out.println();
            for (int w = 0; w < width; w++) {
                System.out.print("*");
            }
        }
    }
}

class Point2D{
    int x;
    int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveLeft(int units){x -= units;}

    public void moveRight(int units){x += units;}

    public void moveUp(int units){y += units;}

    public void moveDown(int units){y -= units;}

    public String coordinates(){
        return "Point (" + x + "; " + y + ")";
    }
}
