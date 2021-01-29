package com.itacademy.lesson4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int [] values = new int [100];
           for (int i = 0, count = 13; i < values.length ; i++) {
               while (true) {
               if (count % 13 == 0 || count % 17 == 0){
                   values [i] = count++;
                    break;
               }
               count++;
            }
        }
        System.out.println(Arrays.toString(values));
    }
}
