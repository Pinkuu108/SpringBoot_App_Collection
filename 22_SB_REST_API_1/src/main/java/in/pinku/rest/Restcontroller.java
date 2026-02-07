package in.pinku.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {

	public Restcontroller() {
	    System.out.println("Rest Constructor is Executed");
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getmsg()
	{
		String msg="Hello Pinkuna ";
		 return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/greet")
   public String getgreet()
   {
	   String msg="Hey chinu How Are You ";
	   return msg;
   }
}
