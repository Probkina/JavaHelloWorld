package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(Plate plt) {
        if (plt.getFood() < appetite) {
            System.out.println("В тарелке недостаточно еды");
        } else if (!isFull) {
            plt.decreaseFood(appetite);
            isFull = true;
        }

    }
}
