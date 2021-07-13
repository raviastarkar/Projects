package com.adtservices.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adtservices.config.DBconnect;
import com.adtservices.model.Student;

public class ListofStudentDAO {

	public List<Student> getAllRecord() {
		 Connection connection = DBconnect.getConnection();
		List<Student> studentlist = new ArrayList<>();
		try {

			String sql = "Select * from STUDENT;";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			studentlist = new ArrayList<Student>();
			while (resultSet.next()) {
				Student student = new Student();
				student.setId(resultSet.getInt(1));
				student.setStudent_name(resultSet.getString(2));
				student.setStudent_dob(resultSet.getString(3));
				student.setStudent_doj(resultSet.getString(4));
				studentlist.add(student);
			} // while
		} // try
		catch (SQLException e) {
			e.printStackTrace();
		} // catch

		return studentlist;

	}// method
	
}
