package com.truonghan.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.truonghan.models.Student;

@Service("studentService")
@Transactional
public interface StudentService {

	public void addStudent(Student student);
	public List<Student> findAll();
}
