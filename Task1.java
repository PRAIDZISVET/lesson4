package com.itacademy.lesson4;

public class Task1 {
    public static void main(String[] args) {
        char [] array = {'a', 't', '1', ']', 'q'};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array [i]);
//        {
//      или в стиле for each:
        for (char value: array) {
            System.out.print(value+ " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array [i] + " ");
        }
    }
}
