package com.aurion.test;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import com.aurion.model.StudentsLinkedlistModel;


public class StudentLinkedListTest {

	public static void main(String[] args) {
		LinkedList<StudentsLinkedlistModel> student1=new LinkedList<>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of students: ");
		int num=scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<num;i++) {
			System.out.println("enter your name: ");
			String name=scanner.nextLine();
			System.out.println("enter your rollnumber: ");
			int rollnumber=scanner.nextInt();
			System.out.println("enter the percentage: ");
			double percentage=scanner.nextDouble();
			scanner.nextLine();
			student1.add(new StudentsLinkedlistModel(name,rollnumber,percentage));
			
			}
			
		Collections.sort(student1,new StudnetsByRollNumber());

		}
		

	}


