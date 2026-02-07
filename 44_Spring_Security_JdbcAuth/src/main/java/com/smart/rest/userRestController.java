package com.smart.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class userRestController {

	@GetMapping("/")
	public String getMethodName() {
		return "Welcome :)";
	}

	@GetMapping("/user")
	public String getuser() {
		return "Welcome User:)";
	}

	@GetMapping("/admin")
	public String getamin() {
		return "Welcome Admin:)";
	}

}
