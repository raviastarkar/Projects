package com.adtservices.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.adtservices.config.DBconnect;

public class DeleteStudentDAO {
	boolean result = false;

	public boolean deleteStudentRecord(int id) {
		try {
			Connection connection = DBconnect.getConnection();
			String sql = "delete from student where student_no=?;";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			int no = preparedStatement.executeUpdate();
			if (no > 0) {
				result = true;
			} else {
				result = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
