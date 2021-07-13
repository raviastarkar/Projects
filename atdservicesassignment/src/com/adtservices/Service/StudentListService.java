package com.adtservices.Service;

import java.util.List;

import com.adtservices.dao.ListofStudentDAO;
import com.adtservices.model.Student;

public class StudentListService {

	private ListofStudentDAO dao = null;

	public List<Student> getAllRecord() {

		dao = new ListofStudentDAO();
		List<Student> studentList = dao.getAllRecord();

		return studentList;
	}

}
