package com.aurion.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurion.entity.Student;


@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=null;
		dispatcher=request.getRequestDispatcher("/StudentTable.jsp");
		List<Student> students=new ArrayList<>();
		 
		 
		 students.add(new Student(1,"abhishek",89));
		 students.add(new Student(2,"abhishek2",69));
		 students.add(new Student(3,"abhishek3",59));
		 students.add(new Student(4,"abhishek4",29));
		 students.add(new Student(5,"abhishek5",59));
		 students.add(new Student(6,"abhishek6",69));
		 request.setAttribute("students", students);
		 dispatcher.forward(request, response);
		 
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
