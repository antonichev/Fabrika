package ua.od.fabrika.antonichev.HW9;

import java.util.Scanner;

/**
 * Доделать практику. Создать класс Student, который состоит содержит члены класса name(String), age(int), mark(int),
 * сделать метод, который выводит данные на экран. Реализовать класс Group, который получает size в конструкторе и
 * создает массив из объектов Student в заданном количестве.
 * В каждый объект студента передать данные через конструктор:
 * •	Name – “Student <порядковый номер>”
 * •	Age – случайно число от 18 до 50.
 * •	Mark – случайное число от 30 до 100.
 * В Group должны быть следующие методы:
 * a.	Вывод всех студентов в группе
 * b.	Вывод среднего возраста
 * c.	Вывод среднего балла
 * d.	Вывод количества студентов с баллом ниже 60.
 * e.	Вывод данных студентов с баллами ниже 60.
 * f.	Вывод лучшего и худшего студента.
 */
public class HW9_task1_Students {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity of students in group:");
        int qty = input.nextInt();

        if (qty <= 0) System.out.println("Error! Wrong data");
        else {
            Group group1 = new Group(qty, "Java Core");

            System.out.println("\nList of students in group \"" + group1.nameOfGroup + "\"");
            group1.printAll();

            group1.meanAge();

            group1.meanMark();

            group1.markLess(60);

            System.out.println("\nList of students with mark less than 60:");
            group1.printAll(60);

            System.out.println(group1.bestAndWorst());
        }
    }
}

class Students{
    public String name;
    public int age;
    public int mark;

    public Students(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
}

class Group {
    public int quantityOfStudents;
    public String nameOfGroup;
    public Students[] students;

    public Group(int quantityOfStudents, String nameOfGroup) {
        this.quantityOfStudents = quantityOfStudents;
        this.nameOfGroup = nameOfGroup;

        students = new Students[quantityOfStudents];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Students(
                    "Student # " + (i + 1),
                    (int) (Math.random() * 50) + 18,
                    (int) (Math.random() * 100) + 30
            );
        }
    }

    public void printAll(){
        System.out.println("\nName\t\t\tAge\t\tMark");

        for (int i = 0; i < students.length; i++) {
            if (i < 9) System.out.println(students[i].name + "\t\t" + students[i].age + "\t\t" + students[i].mark);
            else System.out.println(students[i].name + "\t" + students[i].age + "\t\t" + students[i].mark);
        }
    }

    public void printAll(int mark){
        System.out.println("\nName\t\t\tAge\t\tMark");

        for (int i = 0; i < students.length; i++) {
            if (students[i].mark < mark) {
                if (i < 9) System.out.println(students[i].name + "\t\t" + students[i].age + "\t\t" + students[i].mark);
                else System.out.println(students[i].name + "\t" + students[i].age + "\t\t" + students[i].mark);
            }
        }
    }

    public void meanAge(){
        int sumOfAges = 0;

        for (int i = 0; i < students.length; i++) {
            sumOfAges += students[i].age;
        }

        System.out.println("\nMean age of group is " + sumOfAges / quantityOfStudents);
    }

    public void meanMark(){
        int sumOfMarks = 0;

        for (int i = 0; i < students.length; i++) {
            sumOfMarks += students[i].mark;
        }

        System.out.println("\nMean mark of group is " + sumOfMarks / quantityOfStudents);
    }

    public void markLess(int mark){
        int sumOfMarks = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].mark < mark) sumOfMarks += students[i].mark;
        }

        System.out.println("\nQuantity of students with mark less than 60 is " + sumOfMarks / quantityOfStudents);
    }

    public String bestAndWorst(){
        int bestMark = students[0].mark, worstMark = students[0].mark;

        int bestIndex = 0, worstIndex = 0;

        for (int i = 0; i < students.length; i++) {
            if (bestMark < students[i].mark){
                bestMark = students[i].mark;
                bestIndex = i;
            };

            if (worstMark > students[i].mark){
                worstMark = students[i].mark;
                worstIndex = i;
            };
        }

        return "\nTht best student is " + students[bestIndex].name + " (mark:" + bestMark + ")" +
                ". The worst student is " + students[worstIndex].name + " (mark:" + worstMark + ")";
    }
}
