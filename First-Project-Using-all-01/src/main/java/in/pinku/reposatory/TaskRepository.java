package in.pinku.reposatory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pinku.entity.Task;
import in.pinku.entity.User;

public interface TaskRepository extends JpaRepository<Task, Integer>{

	
	List<Task> findByUser(User user);
}
