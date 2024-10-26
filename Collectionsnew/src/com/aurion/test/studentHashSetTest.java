package com.aurion.test;
import java.util.Collections;
import java.util.HashSet;
import com.aurion.comparator.*;
import java.util.Scanner;

import com.aurion.model.studentHashsetModel;

public class studentHashSetTest {

	public static void main(String[] args) {
		HashSet<studentHashsetModel>student2=new HashSet<studentHashsetModel>();
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
			
//			student2.add(new studentHashsetModel(name,rollnumber,percentage));
//			
//			for(studentHashsetModel stud:student2) {
//				System.out.println(stud);
//			}
			
			
	}

}
}
