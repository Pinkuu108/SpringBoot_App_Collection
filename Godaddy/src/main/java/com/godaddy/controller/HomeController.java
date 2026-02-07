package com.godaddy.controller;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.godaddy.entity.User;

@Controller
public class HomeController {

    // Public page (optional)
    @GetMapping("/")
    public String index() {
        return "home";
    }

    // Protected Home page (after login)
    @GetMapping("/home")
    public String home(HttpSession session, Model model) {

        // get user from session
        User user = (User) session.getAttribute("loggedInUser");

        // if user not logged in
        if (user == null) {
            return "redirect:/login";
        }

        // send user data to page
        model.addAttribute("user", user);

        return "home";
    }

    // About page (public)
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
