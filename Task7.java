package com.itacademy.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
    String [] cardArray = {"2","3","4","5","6","7","8","9", "10", "Jack", "Queen", "King","Ace"};
    String [] suitArray = {"Hearts", "Spades", "Clubs","Diamonds"};

        System.out.println(chooseRandomCard(cardArray, suitArray));
    }

    public static String chooseRandomCard(String [] cardArray, String [] suitArray) {
        Random random = new Random();
        int i = random.nextInt(cardArray.length);
        int j = random.nextInt(suitArray.length);
        return (cardArray [i] + " of " + suitArray [j]);
    }
}
