package in.pinku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.pinku.Application;
import in.pinku.request.Passenger;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MakeMyTrip {

    private final Application application;

    MakeMyTrip(Application application) {
        this.application = application;
    }
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	@PostMapping("/bookticket")
	public String bookticket(Passenger p)
	{
		System.out.println(p);
		return "success";
	}
   
   

}
