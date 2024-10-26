package com.aurion.test;

import com.aurion.model.IFactorial;

public class Factorial {

	public static void main(String[] args) {
	IFactorial factorial=(number)->{
		int fact=1;
		for(int i=1;i<=number;i++)
			fact=fact*i;
		return fact;
		
	};
   System.out.println(factorial.calfactorial(4));
	}

}
