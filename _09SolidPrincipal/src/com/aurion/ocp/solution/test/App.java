package com.aurion.ocp.solution.test;

import java.util.Scanner;
import com.aurion.ocp.solution.model.*;
import com.aurion.ocp.solution.model.Diwali;
import com.aurion.ocp.solution.model.FixedDeposit;
import com.aurion.ocp.solution.model.IFestivaloffer;
//import com.aurion.ocp.violation.model.FixedDeposit;

public class App {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("enter account number: ");
			int accountnumber=scanner.nextInt();
			
			System.out.println("enter name:  ");
			String name=scanner.next();
			scanner.nextLine();
			System.out.println("enter principla amount ");
			double principalamount=scanner.nextDouble();
			System.out.println("enter interest rate: ");
			double interestRate=scanner.nextDouble();
			System.out.println(" enter the festival offer: ");
			System.out.println(" 1.Diwali 2.Holi 3.Christmas 4.Newyear");
			int offer=scanner.nextInt();
			IFestivaloffer festival=null;
			switch(offer) {
			case 1:
				festival=new Diwali();
			
				break;
			case 2:
				festival=new Diwali();
				
				break;
			case 3:
				festival=new Diwali();
			
				break;
			case 4:
				festival=new Diwali();
				
				break;
				
				default:System.out.println("enter valid choicd");
				break;
				}
			System.out.println("enter duration: ");
			int duration=scanner.nextInt();
			
				FixedDeposit fixeddeposit=new FixedDeposit(accountnumber,name,principalamount,duration,festival);
				System.out.println(fixeddeposit);
			
				
			}

	}

