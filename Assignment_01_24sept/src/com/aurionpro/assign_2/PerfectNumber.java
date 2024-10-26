package com.aurionpro.assign_2;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter the number: ");
            int n=scanner.nextInt();
            boolean perfect=isperfect(n);
            if(perfect) {
            	System.out.println("its perfect number");
            }
            else {
            	System.out.println("Its not perfect number");
            }
	}
            public static boolean isperfect(int n) {
            	int sum=0;
            	for(int i=1;i<n;i++) {
            		if(n%2==0)
            			sum=sum+i;
            	}
            	if(sum==n)
            		return true;
            	else {
            	return false;
            	}
            
            
	}

}
