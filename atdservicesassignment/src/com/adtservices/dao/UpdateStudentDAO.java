package com.adtservices.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.adtservices.config.DBconnect;
import com.adtservices.model.Student;

public class UpdateStudentDAO {
	private Student student = null;
	private Connection connection = DBconnect.getConnection();

	public Student getStudentRecord(int id) {
		try {

			String sql = "select * from student where student_no=?;";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				student = new Student();
				student.setId(Integer.parseInt(resultSet.getString(1)));
				student.setStudent_name(resultSet.getString(2));
				student.setStudent_dob(resultSet.getString(3));
				student.setStudent_doj(resultSet.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

	public boolean updateStudent(int id, Student student) throws SQLException {

		String sql = "update student set student_name=?, student_dob=?, student_doj=? where student_no=?;";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, student.getStudent_name());
		preparedStatement.setString(2, student.getStudent_dob());
		preparedStatement.setString(3, student.getStudent_doj());
		preparedStatement.setInt(4, id);
		int result = preparedStatement.executeUpdate();
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}
}
