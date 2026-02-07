package com.smart.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class SicurityRestcontroller {

	@GetMapping("/ho")
	public String getMethodName() {
		return "Home Page";
	}

}
