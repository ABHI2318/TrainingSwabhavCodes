package com.aurionpro.sums;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 151;
		
	        int reversed = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num = num / 10;
	        

	}
  if(num==reversed) {
	  System.out.println(num +"its palindrome");
  }
  else {
	  System.out.println("its not palindrome");
  }
}}
