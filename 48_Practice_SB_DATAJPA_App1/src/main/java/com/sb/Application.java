package com.sb;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sb.entity.Student;
import com.sb.reposatory.StudentReposatory;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	StudentReposatory repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s = new Student();
		s.setName("pinku");
		s.setDept("ECE");
		s.setSalary(56000);
         repo.save(s);
         
		Student s1 = new Student();
		s1.setName("chintu");
		s1.setDept("CSE");
		s1.setSalary(40000);
		repo.save(s1);
		
		Student s2 = new Student();
		s2.setName("kunu");
		s2.setDept("IT");
		s2.setSalary(60000);
		repo.save(s2);
		// find by all
		/* repo.findAll().forEach(System.out::println); */

		// find by Using 'findBydept'
		// repo.findByDept("ECE").forEach(System.out::println);

		//USing Custom Querry
		repo.findStudentWithSalaryGreaterThan(50000).forEach(System.out::println);
	}

}
