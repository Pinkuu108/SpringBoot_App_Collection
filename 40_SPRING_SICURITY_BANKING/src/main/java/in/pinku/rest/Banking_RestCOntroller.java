package in.pinku.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Banking_RestCOntroller {

	@GetMapping("/balance")
	public String getbalance()
	{
		return "Your Balacnce is 2670..";
	}
	@GetMapping("/trancefer")
	public String gettransfer()
	{
		return "Your Balacnce trancefer Sucessfull..";
	}
	@GetMapping("/loginpage")
	public String getloginpage()
	{
		return "Welcome To My LoginPage....";
	}
	@GetMapping("/contact")
	public String getcontactus()
	{
		return "Contact As::pinku@gmail.com";
	}
}
