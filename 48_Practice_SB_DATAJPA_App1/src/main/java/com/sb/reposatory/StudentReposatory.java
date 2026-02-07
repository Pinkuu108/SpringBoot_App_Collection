package com.sb.reposatory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sb.entity.Student;

@Repository
public interface StudentReposatory extends JpaRepository<Student, Long>{

	//find by dept
	//List<Student> findByDept(String dept);
	
	//using Custom Querry
	@Query("SELECT s from Student s where s.salary>?1")
	List<Student> findStudentWithSalaryGreaterThan(int salary);
}
