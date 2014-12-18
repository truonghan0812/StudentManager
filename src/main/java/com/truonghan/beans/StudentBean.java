package com.truonghan.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.truonghan.models.Student;
import com.truonghan.services.StudentService;

@ManagedBean
@Scope
public class StudentBean {

	private List<Student> listStudents;

	@Autowired
	public StudentService studentService;
	public List<Student> getListStudents() {
		listStudents=studentService.findAll();
		return listStudents;
	}

	public void setListStudens(List<Student> listStudents) {
		this.listStudents = listStudents;
	}
	
	public void saveStudent(Student student){
		studentService.addStudent(student);
	}
	
}
