package com.lb.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feignclient",url = "https://jsonplaceholder.typicode.com")
public interface FeignINT {

	
	@GetMapping("/todos/1")
	 String gettodo();
	
}
