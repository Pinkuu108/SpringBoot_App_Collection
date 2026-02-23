package com.lb.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lb.dto.Product;

@RestController
public class HomeController {
	@Autowired
	private RestTemplate rest;

	@GetMapping("/get")
	public Product getthirdparty() {
		String url = "https://dummyjson.com/products/1";
		Product forObject = rest.getForObject(url, Product.class);
		return forObject;
	}

}
