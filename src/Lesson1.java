/*
 * Java 1. Homework #1
 *
 * @author Probkina Anastasia
 * @version 09.12.2021
 */

public class Lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 3;
        int b = 5;
        System.out.println(a + b >= 0 ? "sum is positive" : "sum is negative");
    }

    static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value >= 1 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value >= 101) {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 18;
        int b = 13;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}

