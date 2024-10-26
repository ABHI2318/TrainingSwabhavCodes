package com.aurion.CricketTest;

import java.util.Scanner;

import com.aurion.CricketModel.ModelPlayer;

public class CricketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int average=0;
		  int index=0;
		  // TODO Auto-generated method stub
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("Enter number of Player");
		  int number=scanner.nextInt();
		  ModelPlayer player[]=new ModelPlayer[number];
		  for (int i = 0; i < player.length; i++) {
		   System.out.println("Enter player id");
		   int id=scanner.nextInt();
		   System.out.println("Enter player name");
		   scanner.nextLine();
		   String name=scanner.nextLine();
		   System.out.println("Enter player matches");
		   int match=scanner.nextInt();
		   System.out.println("Enter player Run");
		   int run=scanner.nextInt();
		   System.out.println("Enter player wicket");
		   int wicket=scanner.nextInt();
		   player[i]=new ModelPlayer(id, name, match, run, wicket);
		   
		  }
		  
		  for(int i=0; i<player.length; i++) {
		   int avg=(int)player[i].average();
		  }
		  int n = number;  
		        ModelPlayer temp = null;  
		         for(int i=0; i < n; i++){  
		                 for(int j=1; j < (n-i); j++){  
		                          if((int)player[j-1].average() > (int)player[j].average()){  
		                                 //swap elements  
		                                 temp = player[j-1];  
		                                 player[j-1] = player[j];  
		                                 player[j] = temp;  
		                         }  
		                          

		                 }  
		         }
		         System.out.println("heighest average player");
		         player[number-1].display();
		         
		         System.out.println();
		         System.out.println("Assending order");
		         for(int i=0; i<number; i++) {
		          player[i].display();
		         }
		  
 scanner.close();
	}

}
