package com.gq.service;

import com.gq.beans.Student;
import com.gq.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao dao;
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	public void addStudent(Student student) {
		dao.insertStudent(student);
	}

}
