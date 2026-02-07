package in.Fastbite.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Home page: /
    @GetMapping("/")
    public String home() {
        // home.html
        return "home";
    }
}
