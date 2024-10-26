package com.aurion.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

import com.aurion.comparator.StudentsByName;

import com.aurion.model.StudentModel;

public class studentNameTest {

	public static void main(String[] args) {
		
		  List<StudentModel> students = new ArrayList<StudentModel>(); 
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of students: ");
		int num=scanner.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("enter the name: ");
			String name=scanner.next();
			System.out.println("enter the roll number: ");
			int rollnumber=scanner.nextInt();
			System.out.println("enter the percentage: ");
			double percentage=scanner.nextDouble();
			scanner.nextLine(); 
			
			students.add(new StudentModel(name,rollnumber,percentage));
			Collections.sort(students,new StudentsByName());			

	}
		for(StudentModel student:students) {
			System.out.println(student);
		}

}
}