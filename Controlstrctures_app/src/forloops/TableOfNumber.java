package forloops;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		// Table of a num
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scanner.nextInt();
		for(int i=1; i <= 10; i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);  
			}  
	
	}

}
