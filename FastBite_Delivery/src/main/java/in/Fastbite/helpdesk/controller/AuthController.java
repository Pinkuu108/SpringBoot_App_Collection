package in.Fastbite.helpdesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.Fastbite.helpdesk.entity.User;
import in.Fastbite.helpdesk.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    // ✅ SHOW REGISTER PAGE
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register";   // loads register.html
    }

    // ✅ HANDLE REGISTER FORM SUBMIT
    @PostMapping("/register")
    public String handleRegister(
            @Valid @ModelAttribute("user") User user,
            BindingResult bindingResult,
            Model model) {

        // check duplicate email
        if (userRepository.findByEmail(user.getEmail()) != null) {
            bindingResult.rejectValue("email", "error.user", "Email already registered");
        }

        if (bindingResult.hasErrors()) {
            return "register";
        }

        userRepository.save(user);

        model.addAttribute("successMessage", "Registration successful! Please login.");
        return "login"; // go to login page
    }

    // ✅ SHOW LOGIN PAGE
    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("loginError", null);
        return "login"; // loads login.html
    }

    // ✅ HANDLE LOGIN LOGIC
    @PostMapping("/login")
    public String handleLogin(@RequestParam("email") String email,
                              @RequestParam("password") String password,
                              HttpSession session,
                              Model model) {

        User user = userRepository.findByEmail(email);

        if (user == null || !user.getPassword().equals(password)) {
            model.addAttribute("loginError", "Invalid email or password");
            return "login";
        }

        session.setAttribute("loggedInUser", user);

        // redirect by role
        if ("VOLUNTEER".equals(user.getRole())) {
            return "redirect:/volunteer/pending-requests";
        } else if ("ADMIN".equals(user.getRole())) {
            return "redirect:/admin/dashboard";
        } else {
            return "redirect:/my-requests";
        }
    }

    // ✅ LOGOUT
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
