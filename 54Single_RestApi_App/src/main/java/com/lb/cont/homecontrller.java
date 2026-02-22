package com.lb.cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lb.entity.User;

@RestController
public class homecontrller {
	
	
	@GetMapping("/home")
	public String gethome()
	{
		return "hello Pinku";
	}
	@PostMapping("/user")
     public String getuser(@RequestBody User user)
     {
    	 return "User name:"+user.getName()+"  user id :"+user.getIdd();
     }
}
