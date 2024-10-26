package com.aurion.test;
import com.aurion.model.studentTreeSetModel ;
import java.lang.Comparable;

import java.util.Scanner;
import java.util.TreeSet;

public class StudentTreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<studentTreeSetModel> student=new TreeSet<studentTreeSetModel>();
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
			
			student.add(new studentTreeSetModel(name,rollnumber,percentage));
			for(studentTreeSetModel stud:student) {
				System.out.println(stud);
			}
		

	}

}
}