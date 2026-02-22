package com.lb.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.lb.Application;
import com.lb.entity.User;
import com.lb.repo.UserRepository;

@Component
public class UserRunner implements ApplicationRunner {

	private final Application application;

	@Autowired
	private UserRepository repo;

	UserRunner(Application application) {
		this.application = application;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		repo.deleteAll();
		User u = new User();
		u.setName("pinku");
		u.setCity("Bdk");

		User u1 = new User();
		u1.setName("pintu");
		u1.setCity("Bbsr");

		User u2 = new User();
		u2.setName("chinu");
		u2.setCity("Tillo");

		List<User> all = Arrays.asList(u, u1, u2);
		repo.saveAll(all);

		List<User> listdata = repo.findAll();
		System.out.println(listdata);
		
		
		Optional<User> byId = repo.findById(1);
		System.out.println("Find by id is ::"+byId);
		
		
		repo.deleteById(2);
		System.out.println("UserRunner.run()  Delete");
		
	}

}
