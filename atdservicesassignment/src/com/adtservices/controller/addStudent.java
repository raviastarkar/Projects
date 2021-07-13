package com.adtservices.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adtservices.Service.StudentService;
import com.adtservices.model.Student;

@WebServlet("/addStudent")
public class addStudent extends HttpServlet {

	private Student student;
	private StudentService service = new StudentService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("student_name");
		String dob = request.getParameter("student_dob");
		String doj = request.getParameter("student_doj");

		student = new Student(name, dob, doj);

		int result = service.storeData(student);

		if (result > 0) {
			System.out.println("Record Inserted Successfully...!!!");
			request.setAttribute("msg", "Record Inserted Successfully...!!!");
			response.sendRedirect("listofStudent");

		} else {
			System.out.println("Record Not Inserted. something went wrong");

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
