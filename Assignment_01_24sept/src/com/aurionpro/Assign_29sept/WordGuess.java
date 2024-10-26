package com.aurionpro.Assign_29sept;

import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"rahul", "virat", "dhoni", "rohit", "sachin"};
        boolean keepPlaying = true;

        while (keepPlaying) {
            int attempts = 0;
            boolean isGameOn = true;
            int randomIndex = random.nextInt(words.length);
            String wordToGuess = words[randomIndex];
            char[] guessedWord = new char[wordToGuess.length()];

            
            for (int i = 0; i < wordToGuess.length(); i++) {
                guessedWord[i] = '_';
            }

            System.out.println("Welcome to the Word Guessing Game!");
            System.out.println("You have 6 attempts to guess the word.");

            while (isGameOn) {
                System.out.println("Current word: " + String.valueOf(guessedWord));
                System.out.println("Guess a letter:");

                char guessedLetter = scanner.next().charAt(0);
                boolean isCorrectGuess = false;

                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (guessedLetter == wordToGuess.charAt(i)) {
                        guessedWord[i] = guessedLetter;
                        isCorrectGuess = true;
                    }
                }

                if (!isCorrectGuess) {
                    System.out.println("Wrong guess!");
                }

                attempts++;
                System.out.println("Attempts left: " + (6 - attempts));

               
                if (String.valueOf(guessedWord).equals(wordToGuess)) {
                    System.out.println("Congratulations! You guessed the word: " + wordToGuess);
                    isGameOn = false;
                }

                
                if (attempts >= 10) {
                    System.out.println("You've exhausted your attempts. The correct word was: " + wordToGuess);
                    isGameOn = false;
                }
            }

            System.out.println("Do you want to play again? (y/n):");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("y")) {
                keepPlaying = false;
                System.out.println("Thanks for playing the Word Guesser!");
            }
        }

        scanner.close();
    }
}
