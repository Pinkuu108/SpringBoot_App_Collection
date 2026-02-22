package com.lb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lb.entity.Student;
import com.lb.repo.StudentRepository;

@Service
public class Student_Service {

	@Autowired
	private StudentRepository repo;

	public Student savedata(Student s) {
		return repo.save(s);
	}

	public List<Student> getall() {
		return repo.findAll();
	}
	
	public Student getStudentbyId(Integer id)
	{
		return repo.findById(id).orElse(null);
	}

}
