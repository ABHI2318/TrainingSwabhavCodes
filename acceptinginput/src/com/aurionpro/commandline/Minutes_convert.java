package com.aurionpro.commandline;

public class Minutes_convert {

	public static void main(String[] args) {
		//Write a program that converts minutes into hours and minutes (e.g., 130 minutes is 2 hours and 10 minutes)
		
		int minutes=Integer.parseInt(args[0]);
		
		   int hours = minutes / 60;
           int remainingMinutes = minutes % 60;
           
           System.out.println(+minutes + "  minutes is " + hours + " hours " +" "+remainingMinutes+" minutes ");

	}

}
