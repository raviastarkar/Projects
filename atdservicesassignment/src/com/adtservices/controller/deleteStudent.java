package com.adtservices.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adtservices.Service.DeleteStudentService;

@WebServlet("/deleteStudent")
public class deleteStudent extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		DeleteStudentService deleteStudentService = new DeleteStudentService();

		boolean result = deleteStudentService.deleteStudentRecord(id);

		if (result) {
			response.sendRedirect("listofStudent");
		} else {
			System.out.println("Record not Delete...");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
