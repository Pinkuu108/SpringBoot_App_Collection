package in.pinku.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodRestController {

	
	
	@GetMapping("/good")
	public String getMethodName() {
		return "Hey Everyone";
	}
	
}
