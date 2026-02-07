package in.pinku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pinku.entity.User;
import in.pinku.reposatory.UserReposatory;

@Service
public class UserService {
	@Autowired
	private UserReposatory userReposatory;

	
	public User saveindb(User user)
	{
		userReposatory.save(user);
		return user;
		
	}
	
}
