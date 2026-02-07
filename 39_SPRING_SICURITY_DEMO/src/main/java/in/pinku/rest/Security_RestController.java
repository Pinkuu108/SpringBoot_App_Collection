package in.pinku.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Security_RestController {

	@GetMapping("/c")
   public String getsc()
   {
	   return "Helooooooooooooooooooooooooooo......";
   }
}
