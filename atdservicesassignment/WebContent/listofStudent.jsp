
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/table.css">
</head>
<body>
	<%
		if (request.getAttribute("msg") != null)
			out.println(request.getAttribute("msg"));
	%>
	<br>
	<Br>
	<br>
	<h1 align="center">List of All Student</h1>
	<h3>
		<a href="index.jsp">Add Student</a>
	</h3>
	<br>
	<table id="customers">
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
			<th>Student DOB</th>
			<th>Student DOJ</th>
			<th>Remove</th>
			<th>Modify</th>
		</tr>

			<c:forEach items="${list}" var="student">
			<tr>
				<td><c:out value="${student.id}" />  </td>
				<td><c:out value="${student.student_name}" /> </td>
				<td><c:out value="${student.student_dob}" /> </td>
				<td><c:out value="${student.student_doj}" /> </td>
				<td><a href="deleteStudent?id=${student.id}"> Delete</a></td>
				<td><a href="updateStudent?id=${student.id}"> Update</a></td>

			</tr>
		</c:forEach>

	</table>

</body>
</html>
