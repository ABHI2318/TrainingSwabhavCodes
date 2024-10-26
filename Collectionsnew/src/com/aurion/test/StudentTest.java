package com.aurion.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurion.model.Student;


public class StudentTest {
	public static void main(String[]args) {
	
	List<Student> student=new ArrayList<Student>();
	Scanner scanner=new Scanner(System.in);
	System.out.println("eneter the number of students");
	int num=scanner.nextInt();
	for(int i=0;i<num;i++) {
		System.out.println("enter the name");
		String name=scanner.next();
		System.out.println("enter the roll number");
		int rollnumber=scanner.nextInt();
		
		student.add(new Student(name,rollnumber));
	}
	for(Student studenst:student) {
		System.out.println(studenst);
		
	}

}
}