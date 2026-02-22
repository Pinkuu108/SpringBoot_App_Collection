package com.lb.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lb.client.TodoClient;
import com.lb.user.User;

@RestController
public class TestController {

	@Autowired
	private TodoClient todoClient;

    @GetMapping("/todo")
	public User getrest()
	{
		return todoClient.getTodo();
	}
}
