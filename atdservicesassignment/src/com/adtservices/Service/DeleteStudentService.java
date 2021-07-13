package com.adtservices.Service;

import com.adtservices.dao.DeleteStudentDAO;

public class DeleteStudentService {

	public boolean deleteStudentRecord(int id) {

		DeleteStudentDAO dao = new DeleteStudentDAO();

		boolean result = dao.deleteStudentRecord(id);

		return result;
	}

}
