package com.adtservices.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adtservices.Service.UpdateStudentService;
import com.adtservices.model.Student;

@WebServlet("/updateStudent")
public class updateStudent extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		UpdateStudentService service=new UpdateStudentService();
		
		Student student=service.GetByIdRecord(id);
		
		if(student!=null) {
			request.setAttribute("record", student);
			RequestDispatcher dispatcher=request.getRequestDispatcher("UpdateStudent.jsp");
			dispatcher.forward(request, response);
		}else {
			System.out.println("Record Not Found...");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
