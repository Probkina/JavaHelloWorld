package Lesson6;

public class Cat extends Animal implements CanRun{
    private static int catCount;

    public static int getCatCount(){
        return catCount;
    }

    Cat(int maxRun) {
        super(maxRun, 0);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if(maxRun<=distance){
        System.out.println("Cat run " +distance);
    } else {
            System.out.println("My max distance "+ maxRun);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat can't swim");
    }
}
