package com.adtservices.Service;

import java.sql.SQLException;

import com.adtservices.dao.UpdateStudentDAO;
import com.adtservices.model.Student;

public class UpdateStudentService {
	private UpdateStudentDAO dao = new UpdateStudentDAO();
	public Student GetByIdRecord(int id) {
		
		Student student = dao.getStudentRecord(id);
		return student;
	}
	
	public boolean updateStudentRecord(int id, Student student) {
		boolean Result=false;
		try {
			 Result=dao.updateStudent(id, student);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return Result;
	}
	
	

}
