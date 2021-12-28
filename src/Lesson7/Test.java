/*
 * Java 1. Homework #7
 *
 * @author Probkina Anastasia
 * @version 28.12.2021
 */
package Lesson7;

public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Kitty", 30);
        cats[1] = new Cat("Murzik", 40);
        cats[2] = new Cat("Korzik", 10);
        cats[3] = new Cat("Kompot", 50);
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " " + cat.isFull());
        }

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " " + cat.isFull());
        }

        plate.addFood(100);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " " + cat.isFull());
        }

    }
}
