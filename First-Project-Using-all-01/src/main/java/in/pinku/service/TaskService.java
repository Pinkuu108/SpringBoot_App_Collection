package in.pinku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pinku.entity.Task;
import in.pinku.entity.User;
import in.pinku.reposatory.TaskRepository;

@Service
public class TaskService {
	@Autowired
	private TaskRepository taskRepo;
	
	public Task saveTask(Task task)
	{
		return taskRepo.save(task);
	}
	
	public List<Task> getTasksByUser(User user)
	{
		return taskRepo.findByUser(user);
	}

}
