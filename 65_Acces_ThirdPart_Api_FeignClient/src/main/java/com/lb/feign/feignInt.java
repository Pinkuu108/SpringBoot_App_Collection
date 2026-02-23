package com.lb.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lb.dto.Root;

@FeignClient(name = "enablefeignt", url = "https://jsonplaceholder.typicode.com")
public interface feignInt {

	@GetMapping("/posts/1")
	Root geturl();

}
