package com.aurionpro.Assign_29sept;

import java.util.Random;
import java.util.Scanner;

public class CricketGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Cricket match begins!");
        
        int player1Score = 0;
        int player2Score = 0;
        
        
        System.out.println("Let's do the toss. 0 is for tail and 1 is for heads.");
        int toss = random.nextInt(2); 
        
        if (toss == 0) {
            System.out.println("Player 1 wins the toss and will decide to bat.");
        } else {
            System.out.println("Player 2 wins the toss and will decide to bat");
        }
        
        String start = ""; 
        
        do {
            System.out.println("Press 'b' to bat:");
            start = scanner.next(); 
            
            if (start.equals("b")) {
                int randoms = random.nextInt(7);  
                
                if (randoms == 0) {
                    System.out.println("Player 1 is out! Final score: " + player1Score);
                    break;
                } else if (randoms == 7) {
                    player1Score += 6;  
                } else {
                    player1Score += 1;
                }
                System.out.println("Player 1's score: " + player1Score);
            }
        } while (start.equals("b"));
        
        System.out.println("Player 2 starts playing");
        
       
        do {
            System.out.println("Press 'b' to bat:");
            start = scanner.next(); 
            
            if (start.equals("b")) {
                int randoms = random.nextInt(7);  
                
                if (randoms == 0) {
                    System.out.println("Player 2 is out! Final score: " + player2Score);
                    break;
                } else if (randoms == 7) {
                    player2Score += 6;  
                } else {
                    player2Score +=1;
                }
                System.out.println("Player 2's score: " + player2Score);
            }
        } while (start.equals("b"));
        
       
        System.out.println("Final Scores:");
        System.out.println("Player 1: " + player1Score);
        System.out.println("Player 2: " + player2Score);
        
        
        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
        
        
    }
}
