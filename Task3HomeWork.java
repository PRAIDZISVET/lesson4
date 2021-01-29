package com.itacademy.lesson4;

import java.util.Arrays;

public class Task3HomeWork {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5,6,7,8,9};
        int [] array2 = {10,11,12};

        int[] array3 = twoArraysToOne(array1, array2);
        System.out.println(Arrays.toString(array3));
    }

    private static int[] twoArraysToOne(int[] array1, int[] array2) {
        int [] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array3.length ; i++) {
            if (i < array1.length) {
                array3 [i] = array1 [i];
            } else {
                array3 [i] = array2 [i-array1.length];
            }
        }
        return array3;
    }
}
