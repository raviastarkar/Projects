package com.adtservices.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adtservices.Service.StudentService;
import com.adtservices.Service.UpdateStudentService;
import com.adtservices.model.Student;

@WebServlet("/UpdateStudentRecord")
public class UpdateStudentRecord extends HttpServlet {

	private Student student;
	private UpdateStudentService studentRecord = new UpdateStudentService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("student_name");
		String dob = request.getParameter("student_dob");
		String doj = request.getParameter("student_doj");

		 student = new Student(name, dob, doj);
		boolean result =studentRecord.updateStudentRecord(id, student);
		if(result) {
			response.sendRedirect("listofStudent");
		}else {
			System.out.println("Record Not Updated");
		}
		
		
		
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
