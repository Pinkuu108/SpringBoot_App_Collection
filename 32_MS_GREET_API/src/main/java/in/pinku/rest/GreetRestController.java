package in.pinku.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetRestController {

	@Autowired
	public Environment env;

	@GetMapping("/greet")
	public String getMethodName() {

		String port = env.getProperty("server.port");
		return "WelCome to Pinku World(" + port + ")";
	}

}
