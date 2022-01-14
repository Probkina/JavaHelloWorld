package javacore.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        try {
            int sum = sumArray(new String[][]{{"1","2","3","4"},
                                    {"1","2","3","4"},
                                    {"d","2","3","4",},
                                    {"1","2","3","4"}});
            System.out.println(sum);
        } catch (MyArraySizeException e) {
            System.out.println("Массив не [4][4]");
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }


    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (String[] strings : array) {
            if (strings.length != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum = Integer.parseInt(array[i][j]) + sum;
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;


    }
}