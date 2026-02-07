package com.smart.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GoogleRest {
	
	@GetMapping("/")
	public String getMethodName() {
		return "Welcome to Google Oauth2";
	}
	

}
