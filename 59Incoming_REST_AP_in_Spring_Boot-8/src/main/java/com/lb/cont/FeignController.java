package com.lb.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lb.service.FeignINT;

@RestController
public class FeignController {
	@Autowired
	private FeignINT feignINT;

	@GetMapping("/to")
	public String getm() {
		return feignINT.gettodo();
	}
}
