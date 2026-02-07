package in.pinku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.pinku.entity.User;
import in.pinku.service.UserService;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String showRegisterForm(Model model)
	{
		model.addAttribute("user", new User());
		return "register";
	}
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user,Model model)
	{
		userService.registerUser(user);
		model.addAttribute("msg", "User Registered Successfully");
		return "login";
	}
	@GetMapping("/login")
	public String showLoginFrom()
	{
		return "login";
	}
	@PostMapping("/login")
	public String login(@RequestParam("email") String email,
	                    @RequestParam("password") String password,
	                    HttpSession session,
	                    Model model) {
	    
	    User u = userService.login(email, password);
	    
	    if (u != null) {
	        // Store user data in session
	        session.setAttribute("user", u);
	        return "redirect:/tasks"; // Go to task list page after successful login
	    } else {
	        // Invalid credentials
	        model.addAttribute("error", "Invalid Credentials!");
	        return "login"; // Return to login page
	    }
	}

	
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:/login";
	}

}
