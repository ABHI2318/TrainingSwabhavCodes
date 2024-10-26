package com.aurionpro.Switchcase;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int day=4;
      String dayname;
      switch(day) {
      case 1:
    	  dayname="sunday";
    	  break;
      case 2:
    	  dayname="Monday";
    	  break;
      case 3:
    	  dayname="Tuesday";
    	  break;
      case 4:
    	  dayname="wednesday";
    	  break;
      case 5:
    	  dayname="thrusday";
    	  break;
      case 6:
    	  dayname="friday";
    	  break;
      case 7:
    	  dayname="saturday";
    	default:
    		dayname="dayname is not valid";
    	  
      
      }
      System.out.println("Ths day is "+dayname);
      
	}

}
