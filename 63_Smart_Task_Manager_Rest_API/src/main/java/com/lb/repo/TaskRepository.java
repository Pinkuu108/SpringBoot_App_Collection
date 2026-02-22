package com.lb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lb.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
