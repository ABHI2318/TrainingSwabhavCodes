package com.aurionpro.treasure;

import java.util.Scanner;

public class TressureIsland {

    public static void main(String[] args) {
        // Treasure Island finding path
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Treasure Island.\nYour mission is to find the treasure.");
       
        System.out.println("Left or Right?");
        String direction = scanner.next().toLowerCase();
        
        if (direction.equals("left")) {
           
            System.out.println("Swim or Wait?");
            String action = scanner.next().toLowerCase();
            
            if (action.equals("wait")) {
               
                System.out.println("Which door? Red, Blue, or Yellow?");
                String doorColor = scanner.next().toLowerCase();
                
                if (doorColor.equals("yellow")) {
                   
                    System.out.println("You Win!");
                } else if (doorColor.equals("red")) {
                   
                    System.out.println("Burned by fire. Game Over.");
                } else if (doorColor.equals("blue")) {
                    
                    System.out.println("Eaten by beasts. Game Over.");
                } else {
                    
                    System.out.println("Game Over.");
                }
            } else {
               
                System.out.println("Attacked by trout. Game Over.");
            }
        } else {
            
            System.out.println("Fall into a hole. Game Over.");
        }
        
     
    }
}
