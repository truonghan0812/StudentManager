package com.truonghan.services;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.truonghan.models.Student;

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addStudent(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}

	public List<Student> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Student").list();
	}

}
