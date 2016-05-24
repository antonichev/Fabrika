package ua.od.fabrika.antonichev.HW9;

/**
 * Создать классы, описывающие 5 любых предметов (например - электрочайник,
 * книгу, телефон, гелевую ручку, купюру в 10 гривен, и тп).
 */
public class HW9_task5_FiveClasses {
    public static void main(String[] args) {

    }
}

class Kettle{
    double volume;
    int height;
    String color;
    String brand;
}

class Book{
    double price;
    int quantity_of_pages;
    String author;
    String content;
    boolean state;
    String genre;
}

class CellPhone{
    double price;
    boolean state;
    double thickness;
    double battery;
    String os;
    String owner;
    String brand;
}

class GelPen{
    String color;
    double dot;
    String owner;
    String brand;
}

class BankNote{
    int ratio;
    String color;
    double height;
    double wight;
    String person;
    String country;
}