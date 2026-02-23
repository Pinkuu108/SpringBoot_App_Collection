package com.lb.cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lb.utill.jwtutill;

@RestController
public class AuthController {

	@GetMapping("/login")
	public String login(@RequestParam String username) {
		return jwtutill.generateToken(username);
	}
	@GetMapping("/validate")
	public String validate(@RequestParam String token) {
	    return jwtutill.validateToken(token);
	}
}
