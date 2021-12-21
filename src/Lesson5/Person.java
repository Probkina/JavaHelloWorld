/*
 * Java 1. Homework #5
 *
 * @author Probkina Anastasia
 * @version 21.12.2021
 */

package Lesson5;

class Person {
    private String name;
    private String position;
    private String email;
    private int phone;
    private float salary;
    private int age;

    Person(String name, String position, String email, int phone, float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
