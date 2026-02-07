package in.pinku.conroler;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.pinku.binding.User;



@Controller
public class UserController {
	
	@GetMapping("/")
	public String getvalues()
	{
		return "index";
	}
	
	@PostMapping("/user")
	public String handelreq(User user,Model model)
	{
		System.out.println(user);
		model.addAttribute("rabi", "Applicatin Submiteed Sucessfully..");
		return "index";
	}

}
