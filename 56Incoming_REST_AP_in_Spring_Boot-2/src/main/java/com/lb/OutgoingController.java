package com.lb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OutgoingController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/send")
	public String getouter() {

		String url = "https://dummyjson.com/products/1";

		String resoponse = restTemplate.getForObject(url, String.class);
		return resoponse;
	}

	
	@PostMapping("/in")
	public String incomming()
	{
		return "hello world";
	}
}
