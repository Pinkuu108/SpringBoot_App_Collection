package com.godaddy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.godaddy.entity.User;
import com.godaddy.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    // ---------- SIGNUP ----------

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user, Model model) {

        // check duplicate email
        if (userService.emailExists(user.getEmail())) {
            model.addAttribute("error", "Email already exists");
            return "signup";
        }

        userService.registerUser(user);
        return "redirect:/login";
    }

    // ---------- LOGIN ----------

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/do-login")
    public String doLogin(
            @RequestParam String email,
            @RequestParam String password,
            HttpSession session,
            Model model) {

        User user = userService.loginUser(email, password);

        if (user == null) {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }

        // store user in session
        session.setAttribute("loggedInUser", user);

        return "redirect:/home";
    }

    // ---------- LOGOUT ----------

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
