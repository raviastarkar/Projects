<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center" style="color:green">Add Student</h1>
	
	<h3> <a href="listofStudent"> List Of Record...</a></h3>

	<form action="addStudent">

		<table align="center">
		
			<tr>
				<td><h2>Student Name :</h2></td>
				<td><input type="text" name="student_name" required/></td>
			</tr>

			<tr>
				<td><h2>Student Date Of Birth :</h2></td>
				<td><input type="date" name="student_dob"  pattern="\d{4}-\d{2}-\d{2}" required/></td>
			</tr>

			<tr>
				<td><h2>Student Date of Joining :</h2></td>
				<td><input type="date" name="student_doj" required pattern="\d{4}-\d{2}-\d{2}" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Student" style="color:purple"/></td>
			</tr>
		
		</table>
	</form>
</body>
</html>