package in.pinku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/pk")
	public ModelAndView getWelcomemsg() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "Hello Rabi....");
		mav.setViewName("index");
		return mav;
	}
	@GetMapping("/pkr")
	public String getmsg(Model model) {
		model.addAttribute("msg", "Hello Naman....");
		return "index";
	}
}
