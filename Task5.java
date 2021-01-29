package com.itacademy.lesson4;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
     //   test();

        char [][] values = {{'1', '1', '1', '1', '1'},
                             {'0', '1', '1', '1', '0'},
                              {'0', '0', '1', '0', '0'},
                               {'0', '1', '1', '1', '0'},
                               {'1', '1', '1', '1', '1'} };
        replaceChar(values);
        printValues(values);
    }

    private static void printValues(char[][] values) {
        for (int i = 0; i < values.length ; i++) {
            System.out.println(Arrays.toString(values [i]));
        }
    }

    private static void replaceChar(char[][] values) {
        char asterisk = '*';
        char space = ' ';
        for (int i = 0; i < values.length ; i++) {
            for (int j = 0; j < values [i].length; j++) {
                if (values[i][j] =='1') {
                    values [i][j] = asterisk;
                } else {
                    values [i][j] = space;
                }
//                values [i][j] = '1' ? '*' : ' ';
            }
        }
    }

    private static void test() {
        int [][] values = new int[2][];
        values [0] = new int[5];
        values [1] = new int[2];
        for (int i = 0; i < values.length; i++) {
            System.out.println(Arrays.toString(values [i]));

        }
    }
}
