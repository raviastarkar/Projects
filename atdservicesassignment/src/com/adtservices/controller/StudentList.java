package com.adtservices.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adtservices.Service.StudentListService;
import com.adtservices.model.Student;

@WebServlet("/listofStudent")
public class StudentList extends HttpServlet {

	private StudentListService listService;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		listService = new StudentListService();

		List<Student> studentList = listService.getAllRecord();

		if (studentList != null) {
			request.setAttribute("list", studentList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("listofStudent.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setAttribute("msg", "Record Not Found");
			RequestDispatcher dispatcher = request.getRequestDispatcher("listofStudent.jsp");
			dispatcher.forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
