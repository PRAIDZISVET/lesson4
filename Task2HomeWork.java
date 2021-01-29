package com.itacademy.lesson4;

import java.util.Arrays;

public class Task2HomeWork {
    public static void main(String[] args) {
        int [] array = {1,2,1,3,1};
        checkEqualInts(array);
        System.out.println(Arrays.toString(array));
    }

    private static void checkEqualInts(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array [i];
            for (int j = i+1; j < array.length; j++) {
                if (array [j] == temp ) {
                    array[i] = 0;
                    array [j] = 0;
                }
            }
        }
    }
}
