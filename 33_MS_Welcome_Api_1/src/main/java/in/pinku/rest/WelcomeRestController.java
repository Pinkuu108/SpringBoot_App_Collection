package in.pinku.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pinku.WelcomeFeign;

@RestController
public class WelcomeRestController {
	@Autowired
	private WelcomeFeign wlc;
	@Autowired
	private Environment env;

	@GetMapping("/welcome")
	public String getMethodName() {
		String port = env.getProperty("server.port");
		String msg = "Hey Pinku's(" + port + ")";
		String feigen = wlc.feigen();

		return msg + "," + feigen;
	}

}
