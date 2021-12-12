/*
 * Java 1. Homework #2
 *
 * @author Probkina Anastasia
 * @version 11.12.2021
 */

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        checkTrueFalse(10, 10);
        printPositiveNegative(4);
        isPositive(-5);
        repeatPrint("I love Java", 10);
        checkLeapYears(2021);
    }

    static boolean checkTrueFalse(int a, int b) {
        int sum = a + b;
        return sum <= 20 && sum >= 10;
    }

    static void printPositiveNegative(int value) {
        System.out.println(value >= 0 ? "Positive number" : "Negative number");

    }

    static boolean isPositive(int x) {
        return x < 0;
    }

    static void repeatPrint(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    static boolean checkLeapYears(int year) {
        return (year % 400 == 0 || year % 4 == 0) && year % 100 != 0;
    }

}