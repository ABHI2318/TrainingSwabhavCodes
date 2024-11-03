package com.aurion.tdd;

public class Student {
	private IStudentService studentService;

	public Student(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	public double getPercentage() {
		return studentService.getMarks()/studentService.getStudents();
	}

}
