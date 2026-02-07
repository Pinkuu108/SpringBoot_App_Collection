package com.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sb.entity.StudentEntity;
import com.sb.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("student", new StudentEntity());
		model.addAttribute("students", service.getAllStudent());
		return "form";
	}

	@PostMapping("/submit")
	public String postmapting(StudentEntity student) {
		// TODO: process POST request
		service.saves(student);
		System.out.print("Name::" + student.getName());
		System.out.print("Id::" + student.getId());
		System.out.print("salry::" + student.getSalary());
		System.out.print("dept::" + student.getDept());
		return "redirect:/";
	}

}
