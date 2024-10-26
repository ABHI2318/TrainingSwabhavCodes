package com.aurion.test;

import com.aurion.exceptions.AgeNotValidException;
import com.aurion.model.Voter;

public class VoterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Voter voter1=new Voter("abhi",17);
			System.out.println("age is not valid");
		

	}
		catch(AgeNotValidException exception) {
			System.out.println("your age is not valid should be grater than 18");
		}
			
		}
			
		

}
