package com.aurionpro.sums;

public class revsersenumber {

	public static void main(String[] args) {
		//revsering the number
		int num=456;
		int reversed=0;
		
		while(num!=0) {
			int digit=num%10;
			reversed=reversed*10+digit;
			num=num/10;
		}
		System.out.println(num);
		
	}

}
