package javacore.lesson3;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        appleBox.put(new Apple());
        appleBox.put(new Apple());
        appleBox.put(new Apple());
        appleBox.put(new Apple());
        appleBox.put(new Apple());
        appleBox.put(new Apple());

        orangeBox.put(new Orange());
        orangeBox.put(new Orange());
        orangeBox.put(new Orange());
        orangeBox.put(new Orange());

        orangeBox2.put(new Orange());
        orangeBox2.put(new Orange());

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox2.getWeight());

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(orangeBox.compare(appleBox));

        orangeBox.moveInto(orangeBox2);
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox2.getWeight());


    }
}
