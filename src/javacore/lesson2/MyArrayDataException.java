package javacore.lesson2;

public class MyArrayDataException extends Throwable {
    private int i;
    private int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String getMessage() {
        return "В координатах i="+ i + " и j=" + j + " неверные данные";
    }
}
