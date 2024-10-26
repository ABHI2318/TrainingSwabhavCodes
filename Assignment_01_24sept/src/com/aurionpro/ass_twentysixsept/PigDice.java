package com.aurionpro.ass_twentysixsept;

import java.util.Scanner;
import java.util.Random;

public class PigDice {

	public static void main(String[] args) {
		// PIGDICE GAME
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		boolean playGame = true;
        System.out.println("Welcome to Pig Dice Game!!!");
		while (playGame) {

			int totalScore = 0;
			int turn = 1;
			System.out.println("TURN " + turn);

			while (totalScore < 20) {
				int turnScore = 0;
				boolean turnEnd = true;

				while (turnEnd) {
					System.out.print("Roll or hold? (r/h): ");
					String choice = scanner.next();

					if (choice.equals("r")) {
						int die = random.nextInt(6) + 1;
						System.out.println("Die: " + die);

						if (die == 1) {
							System.out.println("Turn over. No score.");
							turnScore = 0;
							turnEnd = false;
							turn++;
							System.out.println("-------TURN " + turn + "-------");

						} else {
							turnScore += die;
						}

					} else if (choice.equals("h")) {
						System.out.println("Your turnScore is: " + turnScore);
						totalScore += turnScore;
						System.out.println("Your totalScore is: " + totalScore);
						turnScore = 0;
						if (totalScore >= 20) {
							System.out.println("You won in " + turn + " turns!");
							System.out.println("Your total score is " + totalScore);
							break;
						}

						turn++;
						System.out.println("-------TURN " + turn + "-------");
						turnEnd = false;
					}

					if (turnScore >= 20) {
						System.out.println("You won in " + turn + " turns!");
						System.out.println("Your total score is " + turnScore);
						turnEnd = false;
					}

				}

				if (totalScore >= 20) {
					
					break;
				}

			}
			System.out.println("Do you want to play again? (y/n): ");
			String choice2 = scanner.next();

			if (choice2.equals("y")) {
				playGame = true;
			} else {
				playGame = false;
				System.out.println("Game Over!!");
			}

		}
	}
}
