package com.lb.cont;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lb.User;

@RestController
public class ThirdPartySendController {

	@Autowired
	private RestTemplate restTemplate;

	String url = "https://jsonplaceholder.typicode.com/todos/1";

	@GetMapping("/")
	public User getrespponse() {

		User response = restTemplate.getForObject(url, User.class);
		// String resoponse = restTemplate.getForObject(url, String.class);
		return response;
	}

}
