<%@page import="com.adtservices.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center" style="color:green">Update Student Record</h1>
	

	<form action="UpdateStudentRecord">

		<table align="center">		
		
		<tr>
				<td><h2>Student Id :</h2></td>
				<td><input type="text" name="id" readonly value="<c:out value="${record.id}" />" /></td>
			</tr>
		
			<tr>
				<td><h2>Student Name :</h2></td>
				<td><input type="text" name="student_name"  value="<c:out value="${record.student_name}"/>" required/></td>
			</tr>

			<tr>
				<td><h2>Student Date Of Birth :</h2></td>
				<td><input type="date" name="student_dob"  value="<c:out value="${record.student_dob}"/>" required/></td>
			</tr>

			<tr>
				<td><h2>Student Date of Joining :</h2></td>
				<td><input type="date" name="student_doj" value="<c:out value="${record.student_doj}"/>" required  /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update Student" style="color:red"/></td>
			</tr>
			
		</table>
	</form>
</body>
</html>