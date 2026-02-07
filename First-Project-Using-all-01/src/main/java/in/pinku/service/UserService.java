package in.pinku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pinku.entity.User;
import in.pinku.reposatory.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;

	public User registerUser(User user)
	{
		return userRepo.save(user);
	}
	
	public User login(String email,String password)
	{
		User u=userRepo.findByEmail(email);
		if(u!=null && u.getPassword().equals(password))
		{
			return u;
		}
		return null;
	}
}
