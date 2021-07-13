package com.adtservices.Service;

import com.adtservices.dao.StudentDao;
import com.adtservices.model.Student;

public class StudentService {
	private StudentDao dao=new StudentDao();	
	public int storeData(Student student) {
		System.out.println("Step 3");
		int result =dao.storeData(student);	
		System.out.println("Step 7");
		return result;
	}

}
