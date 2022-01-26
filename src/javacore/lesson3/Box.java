package javacore.lesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class Box<T extends  Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();

    public void put(T fruit){
        fruits.add(fruit);
    }

    public float getWeight() {
        float sum = 0;
        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(Box box){
        return this.getWeight() == box.getWeight();
    }

    public void moveInto(Box<T> box){
        Iterator<T> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            box.put(iterator.next());
            iterator.remove();
        }
    }
}
