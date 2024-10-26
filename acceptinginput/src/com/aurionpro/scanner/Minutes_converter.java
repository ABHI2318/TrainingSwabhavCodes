package com.aurionpro.scanner;

import java.util.Scanner;

public class Minutes_converter {

	public static void main(String[] args) {
		// 
		Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter the minutes ");
        int minutes=scanner.nextInt();
       
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        
        System.out.println(+minutes + "  minutes is " + hours + " hours " +" "+remainingMinutes+" minutes ");

        
	}

}
