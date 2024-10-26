package com.aurion.arrayss;
import java.util.*;

public class ShiftingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scanner=new Scanner(System.in);
          System.out.println("enter the string");
          String input=scanner.next();
          String output=" ";
          for(int i=0;i<input.length();i++) {
        	  char store=(char)(input.charAt(i)+3);
        	  output+=store;
          }
          System.out.println("the output is "+output);
	}

}
