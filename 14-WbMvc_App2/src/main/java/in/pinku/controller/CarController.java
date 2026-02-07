package in.pinku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
	
	
	//http:localhost:8080/car/102/od
	@GetMapping("/car/{carid}/od/{brand}")
	public ModelAndView getcarcolour(@PathVariable Integer carid,String brand)
	{
		ModelAndView m=new ModelAndView();
		
		String colour =null;
		if(carid>=100)
		{
			colour="Red";
		}
		else
		{
			colour="White";
		}
		
		m.addObject("rabi", "Car colour is::"+colour+"Brand is ::"+brand);
		m.setViewName("index");
		
		return m;
	}
	//localhost:8080/pinku/odisha/honda
	@GetMapping("/pinku/{loc}/{brand}")
	public ModelAndView getview(@PathVariable String loc,@PathVariable String brand)
	{
		
//		System.out.println("Name::"+name);
//		String ss= name+" Good Evening TO EveryOne.....";
		ModelAndView m=new ModelAndView();
		m.addObject("rabi",brand+" :Car"+"is out ofd Stuct At Lcation::"+loc);
		m.setViewName("index");
		return m;
	}

}
