/*
 * Java 1. Homework #5
 *
 * @author Probkina Anastasia
 * @version 21.12.2021
 */

package Lesson5;


public class Lesson5 {
    public static void main(String[] args) {
        Person person = new Person("Maria", "Teacher", "Maria@email.ru", 892334455, 99000.00f, 31);
        System.out.println(person);
        Person[] persons = new Person[5];
        persons[0] = new Person("Anna", "Java Developer", "Anna@email.ru", 8924455, 200000.00f, 35);
        persons[1] = new Person("Alexander", "QA", "Alexander@email.ru", 992244, 150000.00f, 25);
        persons[2] = new Person("Olga", "Manager", "Olga@email.ru", 6644123, 100000.00f, 43);
        persons[3] = new Person("Dmitriy", "Disigner", "Dmitriy@email.ru", 123098, 143994.99f, 41);
        persons[4] = new Person("Roman", "Senior Java Developer", "Roman@email.ru", 33492, 250000.00f, 50);
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() >= 40) {
                System.out.println((persons[i]));
            }
        }
    }
}



