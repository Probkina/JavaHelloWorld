package Lesson6;

public class Test {
    public static void main(String[] args) {
        Animal dog1 = new Dog(500, 10);
        Animal cat1 = new Cat(200);
        Dog dog2 = new Dog(300, 30);
        CanRun runDog2 = dog2;
        CanSwim swimDog2 = dog2;
        CanRun runCat2 = new Cat(200);

        dog1.run(400);
        dog1.swim(5);
        cat1.run(100);
        cat1.swim(100);
        runDog2.run(200);
        swimDog2.swim(10);
        runCat2.run(150);

        System.out.println("animals count: " + Animal.getAnimalCount());
        System.out.println("cats count: " + Cat.getCatCount());
        System.out.println("dogs count: " + Dog.getDogCount());

    }
}
