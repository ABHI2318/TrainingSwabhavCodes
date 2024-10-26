package com.aurionpro.Switchcase;

import java.util.Scanner;

public class MonthSeason {

	public static void main(String[] args) {
		// TODO
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number from 1-12 ");
        int month = scanner.nextInt();
        String season;
        switch (month) {
        case 11:  case 12: case 1: case 2:
            season = "Winter";
            break;
      case 6: case 7: case 8: case 9 :
            season = "Rainy";
            break;
        case 3: case 4: case 5:
            season = "Summer";
            break;
        default:
            season = "Invalid month is there";
            break;
    }
    System.out.println("The season is: " + season);
	}

}
