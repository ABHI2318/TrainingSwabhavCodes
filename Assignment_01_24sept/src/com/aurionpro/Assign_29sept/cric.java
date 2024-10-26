package com.aurionpro.Assign_29sept;


import java.util.Random;
import java.util.Scanner;

public class cric {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Random rand  = new Random();
		
		System.out.println("lets start the game ");
		
		 int num ; 
		
		int i; int score1=0; int score2=0;

		
		while(true)
		{
			System.out.println("Lets toss");
			System.out.println("Any one player can call the toss as 0 for heads nad 1 for tails ");
			int heads = 1; int tails = 0;
			int toss = rand.nextInt(heads-tails+1) + tails;
			
			System.out.println("ths toss is "+ toss);
			if(toss==0)
			{
				System.out.println("Player 1 will play first");
			}
			else
			{
				System.out.println("player 2 will play first");

			}
			String press;
			do
			{
				System.out.println("Press b to bat");
				press=scanner.next();
				
				int random = rand.nextInt(10);
				random= (random*2)%10;
				System.out.println("The number generated is " +random);
				
				if(random==0)
				{
					System.out.println("The player got out at  "+ score1);
					break;
				}
				else if(random==8)
				{
					score1+=6;
				}
				else
				{
				score1+=random;
				}
				
			
			}while(press.equals("b"));

			System.out.println("Player 2 start playing ");
			
			do
			{
				System.out.println("Press b to bat");
				press=scanner.next();
				
				int random = rand.nextInt(10);
				random= (random*2)%10;
				System.out.println("The number generated is " +random);
				
				if(random==0)
				{
					System.out.println("The player got out at  "+ score2);
					break;
				}
				else if(random==8)
				{
					score2+=6;
				}
				else
				{
				score2+=random;
				}
				
			
			}while(press.equals("b"));
			
			if(score1>score2)
			{
				System.out.println("Player1 wins");
				
			}
			else if(score1<score2)
			{
				System.out.println("Player2 wins");
			}
			else
			{
				System.out.println("Draw");
			}
			System.out.println("do you want to play again press y for yess and n for no");
			 String yesorno =scanner.next();
			 score1=0;
			 score2=0;
			 
			 if(!yesorno.equals("y"))
			 {
				 break;
			 }
			 else if(yesorno.equals("n"))
			 {
				 System.out.println("Thank You ");
			 }
			 else
			 {
				 System.out.println("Wrong Inputs");
			 }
		}

	}

}