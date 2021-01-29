package com.itacademy.lesson4;

public class Task3 {
    public static void main(String[] args) {
        int [] array = {5,2,1,8,6,4};

        int minArrayIndex = findMinArrayIndex(array);
        int maxArrayIndex = findMaxArrayIndex(array);
        int sum = sumArrayBetweenIndexes(array, minArrayIndex, maxArrayIndex);
        System.out.println(sum);
    }

    private static int sumArrayBetweenIndexes(int[] array, int minArrayIndex, int maxArrayIndex) {
        int startIndex = minArrayIndex < maxArrayIndex ? minArrayIndex : maxArrayIndex;
        int endIndex = minArrayIndex > maxArrayIndex ? minArrayIndex : maxArrayIndex;
        int sum = 0;
        for (int i = startIndex+1; i < endIndex; i++) {
             sum += array [i];
        }
        return sum;
    }

    private static int findMinArrayIndex(int[] array) {
        int minArrayIndex = 0;
        for (int i = 1; i < array.length ; i++) {
            if (array [minArrayIndex] > array [i]) {
                minArrayIndex = i;
            }
        }
        return minArrayIndex;
    }

    private static int findMaxArrayIndex(int[] array) {
        int maxArrayIndex = 0;
        for (int i = 1; i < array.length ; i++) {
            if (array [maxArrayIndex] < array [i]) {
                maxArrayIndex = i;
            }
        }
        return maxArrayIndex;
    }
}
