package in.pinku.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.pinku.exception.CustomernotfoundException;


@RestController
public class CustomerRestController {
	@GetMapping("/Customer/{Customerid}")
	public String getMethodName(@PathVariable Integer Customerid) throws Exception{
		
		if(Customerid>=100)
		{
			return "pinku";
		}
		else
		{
			throw new CustomernotfoundException("Customoer Not Found");
		}
		
	}
	

}
