package com.itacademy.lesson4;

import java.util.Arrays;

public class Task4HomeWork {
    public static void main(String[] args) {
    int [][] array = {
        {1,2,3,3,3},
        {4,5,6,6,6},
        {7,8,9,9,9},
            {5,5,5,5,5},
            {7,7,7,7,7,}
    };
        int[] array1 = squareToLineArray(array);
        System.out.println(Arrays.toString(array1));
    }

    private static int[] squareToLineArray(int[][] array) {
        int [] array1 = new int[array.length * array[0].length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array1 [i+j+count] = array[i][j];
            }
            count += array.length - 1;
        }
        return array1;
    }
}
