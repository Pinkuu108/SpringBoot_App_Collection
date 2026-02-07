package com.lb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lb.entity.Student;
import com.lb.repository.StudentRepository;
@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public Student savee(Student student)
	{
		return repo.save(student);
	}
	
	//find All Student
	public List<Student> getallstd()
	{
		return repo.findAll();
	}
	
	public Student getbyid(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
}
