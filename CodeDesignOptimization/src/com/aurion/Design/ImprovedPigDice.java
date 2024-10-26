package com.aurion.Design;

import java.util.Random;
import java.util.Scanner;

public class ImprovedPigDice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Pig Dice Game!");

        boolean playGame = true;

        while (playGame) {
            playSingleGame(scanner, random);
            playGame = askToPlayAgain(scanner);
        }

        System.out.println("Thanks for playing! Game Over!!");
    }

    private static void playSingleGame(Scanner scanner, Random random) {
        int totalScore = 0;
        int turn = 1;
        
        while (true) {  
            System.out.println("------- TURN " + turn + " -------");
            totalScore = playTurn(scanner, random, totalScore);
            if (totalScore >= 20) {
                System.out.println("You won with a total score of " + totalScore + "! Game over!");
                return; 
            }
            if (totalScore == 0) {
                
                return; 
            }
            turn++;
        }
    }


        private static int playTurn(Scanner scanner, Random random, int totalScore) {
            boolean turnEnd = false;

            while (!turnEnd) {
                String choice = getPlayerChoice(scanner);
                totalScore = handleChoice(choice, random, totalScore);
                if (choice.equals("h")) {
                    System.out.println("You chose to hold. Your total score is: " + totalScore);
                    turnEnd = true; 
                }
                if(totalScore >= 20) {
                	return totalScore; 
                	
                }
                if(totalScore == 0) {
                	return totalScore; 
                	
                }
                
            }
            return totalScore; 
        }    
        
        
    private static int handleChoice(String choice, Random random, int totalScore) {
    	
    	if (choice.equals("r")) {
            return handleRoll(random, totalScore);
        }
		return totalScore;
    	
    }
    private static int handleRoll(Random random, int totalScore) {
    	 int die = rollDice(random);
    	 if (die == 1) {
             System.out.println(" Game over!");
             return 0;
         }
         totalScore += die;  
         System.out.println("Your total score is: " + totalScore);
         return totalScore; 
     }
	

	private static String getPlayerChoice(Scanner scanner) {
        System.out.print("Roll or hold? (r/h): ");
        return scanner.next();
    }

    private static int rollDice(Random random) {
        int die = random.nextInt(6) + 1;
        System.out.println("You rolled a " + die);
        return die;
    }

    private static boolean askToPlayAgain(Scanner scanner) {
        System.out.print("Do you want to play again? (y/n): ");
        String choice = scanner.next();
        return choice.equals("y");
    }
}
	