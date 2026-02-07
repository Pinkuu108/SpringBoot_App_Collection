package in.pinku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymleafController {
	
	@GetMapping("/welcome")
	public String getmsg(Model model)
	{
		model.addAttribute("msg", "Welcome to My World..");
		return "index";
	}

}
