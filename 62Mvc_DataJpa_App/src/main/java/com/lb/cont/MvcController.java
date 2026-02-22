package com.lb.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lb.enti.User;
import com.lb.repo.UserRepo;

@Controller
public class MvcController {
	@Autowired
	private UserRepo repo;

	@GetMapping("/index")
	public String getdata(Model model) {
		model.addAttribute("msg", "welcome to Pinku");
		model.addAttribute("user", new User());
		  model.addAttribute("users", repo.findAll()); // ⭐ IMPORTANT
		return "index";
	}

	@PostMapping("/save")
	public String saveUser(@ModelAttribute User user, Model model) {

		model.addAttribute("msg", "Data Submitted Successfully ✅");

		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getCity());
		repo.save(user);
		  model.addAttribute("users", repo.findAll()); // ⭐ IMPORTANT
		return "index";
	}

}
