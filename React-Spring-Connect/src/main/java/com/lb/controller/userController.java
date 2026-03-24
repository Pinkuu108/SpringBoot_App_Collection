package com.lb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lb.model.saveUser;
import com.lb.repository.userRepository;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:5174")
public class userController {

    @Autowired
    private userRepository repo;

    // ✅ REGISTER
    @PostMapping("/register")
    public saveUser registerUser(@RequestBody saveUser user) {
        return repo.save(user);
    }

    // ✅ LOGIN
    @PostMapping("/login")
    public String loginUser(@RequestBody saveUser user) {

        saveUser existingUser = repo.findByEmailAndPassword(
                user.getEmail(),
                user.getPassword()
        );

        if (existingUser != null) {
            return "Login Success";
        } else {
            return "Invalid Email or Password";
        }
    }

    // ✅ GET USER
    @GetMapping("/{id}")
    public Optional<saveUser> getUser(@PathVariable Integer id) {
        return repo.findById(id);
    }
}