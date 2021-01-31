package com.itacademy.lesson4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int [][] array = {
                {5,1,7},
                {9,2,4},
                {3,11,3},
        } ;
        int [][] array2 = {
                {1,1,1},
                {2,2,2},
                {3,3,3},
        };
        System.out.println(equals(array,array2));
    }

    private static boolean equals (int [][] array,int [][] array2) {
            Random random = new Random();
            int i = random.nextInt(array.length);
            int j = random.nextInt(array [0].length);
           System.out.println("i: " + i + "\nj: " + j);
            if (array [i][j] == array2 [i][j]) {
                return true;
            }
            return false;
    }

}
