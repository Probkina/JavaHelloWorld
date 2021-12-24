package Lesson6;

abstract class Animal {
    private static int animalCount = 0;
    protected int maxRun;
    protected int maxSwim;

    public static int getAnimalCount(){
        return animalCount;
    }

    Animal(int maxRun, int maxSwim) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        animalCount++;
    }

    abstract void run(int distance);

    abstract void swim(int distance);
}
