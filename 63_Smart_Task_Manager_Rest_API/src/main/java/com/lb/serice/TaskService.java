package com.lb.serice;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lb.entity.Task;
import com.lb.repo.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository repo;;

	public Task savetask(Task task) {
		task.setLocalDateTime(LocalDateTime.now());
		return repo.save(task);

	}

	public List<Task> findall() {
		return repo.findAll();
	}

}
