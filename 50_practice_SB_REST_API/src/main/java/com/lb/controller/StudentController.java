package com.lb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lb.entity.Student;
import com.lb.service.StudentService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/std")
public class StudentController {

	@Autowired
	private StudentService std;
	 @PostMapping("/")
	  public Student saveall(@RequestBody Student student)
	  {
		return std.savee(student);
	  }
	 
	 @GetMapping("/data")
	 public List<Student> getalldata()
	 {
		 
		  return std.getallstd();
	 }
	 @GetMapping("/{id}")
	 public Student getbyid(@PathVariable Integer id)
	 {
		 return std.getbyid(id);
	 }
}
