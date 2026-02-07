package com.sb.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.entity.StudentEntity;

public interface StudentReposatory extends JpaRepository<StudentEntity,Integer> {

}
