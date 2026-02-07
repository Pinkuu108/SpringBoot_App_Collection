package in.pinku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@GetMapping("/pi")
	public ModelAndView getview(@RequestParam String name)
	{
		
		System.out.println("Name::"+name);
		String ss= name+" Good Evening TO EveryOne.....";
		ModelAndView m=new ModelAndView();
		m.addObject("rabi",ss);
		m.setViewName("index");
		return m;
	}
	
	//localhost:8080/pk?name=chandika
	@GetMapping("/pk")
	public String getname(@RequestParam String name,Model model)
	{
		model.addAttribute("rabi",name+": Is A Hacker");
		return "index";
	}
	
	//http://localhost:8080/game?name=Chandu&gamename=pubg
	@GetMapping("/game")
	public ModelAndView getviews(@RequestParam String name,String gamename)
	{
		
		System.out.println("Name::"+name);
		System.out.println("Game name::"+gamename);
		//String ss= name+" Good Evening TO EveryOne.....";
		ModelAndView m=new ModelAndView();
		m.addObject("rabi",name+" is playing "+gamename+" iS a Lartest Game");
		m.setViewName("index");
		return m;
	}
}
