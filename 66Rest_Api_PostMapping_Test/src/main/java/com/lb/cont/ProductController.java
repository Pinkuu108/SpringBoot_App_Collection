package com.lb.cont;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lb.dto.Product;

@RestController
public class ProductController {

	@PostMapping("/add")
	public String getacces(@RequestBody Product product) {
		return "Product Info :: Product ID::" + product.getId() + "Product name ::" + product.getName() + "Product Task"
				+ product.getTask();

	}

}
