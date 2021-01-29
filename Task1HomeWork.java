package com.itacademy.lesson4;

import java.util.Arrays;

public class Task1HomeWork {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int transit = 0;
        int transit2 = 0;
        moveArrayRight(array, transit, transit2);
        System.out.println(Arrays.toString(array));
    }

    private static void moveArrayRight(int[] array, int transit, int transit2) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                transit= array [0];
                array [0] = array [array.length-1];
            } else {
                if (transit == 0) {
                  transit = array [i];
                  array [i] = transit2;
                  transit2 = 0;
                } else {
                    transit2 = array [i];
                    array [i] = transit;
                    transit = 0;
                }
            }
        }
    }
}
