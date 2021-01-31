package com.itacademy.lesson4;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {

        String[] cardArray = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suitArray = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] deckOfCardsArray = new String[52];
        int n = 1;

        replaceCardsArray(cardArray, suitArray, deckOfCardsArray);
        printCardsArray(deckOfCardsArray, n);
    }

    private static String replaceCardsArray(String[] cardArray, String[] suitArray, String[] deckOfCardsArray) {
        Random random = new Random();
        for (int i = 0; i < 52; i++) {
            if (i == 0) {
                deckOfCardsArray[i] = Task7.chooseRandomCard(cardArray, suitArray);
            } else {
                deckOfCardsArray[i] = Task7.chooseRandomCard(cardArray, suitArray);
                for (int j = i - 1; j >= 0; j--) {
                    while (deckOfCardsArray[i].equals(deckOfCardsArray[j])) {
                        deckOfCardsArray[i] = Task7.chooseRandomCard(cardArray, suitArray);
                        j = i-1;
                    }
                }
            }
        }
        return String.valueOf(deckOfCardsArray);
    }

    private static void printCardsArray(String[] deckOfCardsArray, int n) {
        for (String value : deckOfCardsArray) {
            System.out.println(n++ + ": " + value);
        }
    }
}