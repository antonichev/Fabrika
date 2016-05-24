package ua.od.fabrika.antonichev.HW9;

/**
 * Реализовать класс Pet, который описывает характеристики и поведение
 * домашнего питомца (собаки, рыбки, хомячка, удава, и тп).
 */
public class HW9_task2_MyPet {
    public static void main(String[] args) {
        Pet dog = new Pet("Butcher", "black", "woof-woof", 10, 100, true);
        Pet cat = new Pet("Tom", "gray", "meow-meow", 5, 50, true);
        Pet constrictor = new Pet("Kaa", "gray-green-other", "psss-psss", 50, 500, false);

        cat.wagTheTail();

        dog.sayMyName();
        dog.fight(cat);

        constrictor.makeASound();
    }
}

class Pet{
    public String name;
    public String color;
    public String sound;
    public int age;
    public int strength;
    public boolean abilityOfWagging;

    public Pet(String name, String color, String sound, int age, int strength, boolean abilityOfWagging) {
        this.name = name;
        this.color = color;
        this.sound = sound;
        this.age = age;
        this.strength = strength;
        this.abilityOfWagging = abilityOfWagging;
    }

    public void makeASound(){
        System.out.println(name + " says: \"" + sound + "\"");
    }

    public void sayMyName(){
        System.out.println("This pet's name is " + name);
    }

    public void fight(Pet animal){
        System.out.println(name + " attacks " + animal.name);

        if (this.strength > animal.strength){
            System.out.println(name + " win! " + animal.name + " needs to go to pet hospital");
        }

        if (this.strength < animal.strength){
            System.out.println(animal.name + " win! " + name + " needs to go to pet hospital");
        }

        if (this.strength == animal.strength){
            System.out.println("Tie!");
        }
    }

    public void wagTheTail(){
        if (abilityOfWagging) System.out.println(name + " wagging the tail");
        else System.out.println(name + " has no ability of wagging, sorry");
    }


}

