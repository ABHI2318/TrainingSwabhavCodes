package com.aurion.dbtest;

import com.aurion.studentsdb.StudentsDB;

public class test {

	public static void main(String[] args) {
		StudentsDB studentdb=new StudentsDB();
		studentdb.connect();
		//studentdb.addStudent();
		studentdb.updateDetails();
	//	studentdb.deleteRecord();
		studentdb.getStudents();
				

	}

}
