package Lesson6;

public class Dog extends Animal implements CanRun, CanSwim {
    private static int dogCount;

    public static int getDogCount() {
        return dogCount;
    }

    Dog(int maxRun, int maxSwim) {
        super(maxRun, maxSwim);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if(distance<=maxRun) {
            System.out.println("Dog run " + distance);
        } else {
            System.out.println("My max distance "+ maxRun);
        }
    }

    @Override
    public void swim(int distance) {
        if(distance<=maxSwim) {
            System.out.println("Dog swam "+ distance);
        } else {
            System.out.println("My max distance "+ maxSwim);
        }
    }
}
