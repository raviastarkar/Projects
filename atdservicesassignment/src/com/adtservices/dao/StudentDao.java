package com.adtservices.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adtservices.config.DBconnect;
import com.adtservices.model.Student;

public class StudentDao {

	

	public int storeData(Student student) {
		 Connection connection = DBconnect.getConnection();
		int result = 0;
		try {
			String sql = "insert into student (student_name, student_dob, student_doj) values(?,?,?);";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getStudent_name());
			preparedStatement.setString(2, student.getStudent_dob());
			preparedStatement.setString(3, student.getStudent_doj());

			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return result;
	}

	

}
