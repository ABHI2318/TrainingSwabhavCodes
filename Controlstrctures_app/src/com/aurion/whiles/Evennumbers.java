package com.aurion.whiles;

public class Evennumbers {

	public static void main(String[] args) {
		// even sum printing
		
		int sum=0;
		int num=1;
		while(num<=100) {
			if(num%2==0) {
				sum=sum+num;
				System.out.println(sum);
			}
			num++;
		}

	}

}
