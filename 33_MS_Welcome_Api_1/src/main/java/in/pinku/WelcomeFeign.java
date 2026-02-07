package in.pinku;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="GREET-API" )
public interface WelcomeFeign {

	@GetMapping("/greet")
	public String feigen();
	
	
}
