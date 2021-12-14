/*
 * Java 1. Homework #3
 *
 * @author Probkina Anastasia
 * @version 14.12.2021
 */

import java.util.Arrays;


public class Lesson3 {
    public static void main(String[] args) {
        changeZeroToOne(new int[]{1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1});
        fillArrays();
        checkLessThenSix(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        fillDoubleArrays();
        returnArrays(new int[10], 456);
        findMaxMinArrays(new int[]{123, 45, 76, 33, 9, 44, 29, 457, 331, 2});
    }

    static void changeZeroToOne(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] == 1? 0: 1;
//            if (numbers[i] == 1) {
//                numbers[i] = 0;
//            } else if (numbers[i] == 0) {
//                numbers[i] = 1;
//            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    static void fillArrays() {
        int[] numbers = new int[100];
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }

    static void checkLessThenSix(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] = numbers[i] * 2;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    static void fillDoubleArrays() {
        System.out.println("#######");
        int[][] numbers = new int[4][4];
        printArray(numbers);
        System.out.println("#######");
        int value = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    numbers[i][j] = value;
                }
                if (i + j == numbers.length -1){
                    numbers[i][j] = value;
                }
            }

        }
        printArray(numbers);
    }

    static int[] returnArrays(int[] len, int initialValue) {
        for (int i = 0; i < len.length; i++) {
            len[i] = initialValue;
        }
        return len;
    }

    static void findMaxMinArrays(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min + " " + max);
    }

    static void printArray(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
    }

}



