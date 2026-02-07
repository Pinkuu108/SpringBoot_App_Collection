package com.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.entity.StudentEntity;
import com.sb.reposatory.StudentReposatory;

@Service
public class StudentService {
	@Autowired
	StudentReposatory repo;
	
	public void saves(StudentEntity student)
	{
		repo.save(student);
	}
	
	public List<StudentEntity> getAllStudent()
	{
		return repo.findAll();
		 
	}

}
