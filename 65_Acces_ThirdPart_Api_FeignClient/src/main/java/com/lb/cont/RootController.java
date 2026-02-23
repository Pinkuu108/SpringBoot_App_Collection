package com.lb.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lb.dto.Root;
import com.lb.feign.feignInt;

@RestController
public class RootController {
	@Autowired
	private feignInt feign;

	@GetMapping("/root")
	public Root getdata() {
		return  feign.geturl();
		
	}
}
