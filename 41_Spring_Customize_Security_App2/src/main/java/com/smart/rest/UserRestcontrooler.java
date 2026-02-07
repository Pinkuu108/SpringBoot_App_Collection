package com.smart.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserRestcontrooler {

	@GetMapping("/")
	public String getlogin() {
		return "Login Sucessfully";
	}

	@GetMapping("/balance")
	public String getbalance() {
		return "Your Balance is $130..";
	}

	@GetMapping("/transfer")
	public String gettranser() {
		return "Your Balance Transfer Sucessfully...";
	}

	@GetMapping("/about")
	public String getabout() {
		return "This is Your about Page...";
	}

	@GetMapping("/contact")
	public String getcontact() {
		return "pinkuna@gmail.com";
	}
}
