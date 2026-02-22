package com.lb.cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.lb.Application;
import com.lb.entity.Student;
import com.lb.service.Student_Service;

@RestController
public class StudentCont {

  
	
	@Autowired
	private Student_Service servcive;

    	
	@PostMapping("/save")
	public Student save(@RequestBody Student std)
	{
		return servcive.savedata(std);
	}
	
	@GetMapping("/")
	public List<Student>  getalldata()
	{
		
		return servcive.getall();
	}
	
	@GetMapping("/{id}")
	public Student getbyid(@PathVariable Integer id)
	{
		return servcive.getStudentbyId(id);
	}
	

}
