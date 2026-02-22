package com.lb.cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lb.entity.Task;
import com.lb.serice.TaskService;

@RestController
public class TaskController {

	@Autowired
	private TaskService service;

	@PostMapping("/create")
	public Task savedata(@RequestBody Task task) {
		return service.savetask(task);

	}
	
	@GetMapping("/all")
	public List<Task> findalldata()
	{
		return service.findall();
	}
}
