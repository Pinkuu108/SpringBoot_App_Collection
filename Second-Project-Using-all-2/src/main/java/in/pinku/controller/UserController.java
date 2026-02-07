package in.pinku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import in.pinku.entity.User;
import in.pinku.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String getregister(Model model) {
        model.addAttribute("user", new User());  // ✅ correct usage
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute User user) {
        userService.saveindb(user);  // ✅ only save entity, not model
        return "success";  // return to a success page
    }
}
