package com.godaddy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.godaddy.entity.User;
import com.godaddy.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // ---------- REGISTER ----------
    public void registerUser(User user) {
        user.setEnabled(true);

        // encrypt password
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        userRepository.save(user);
    }

    // ---------- LOGIN ----------
    public User loginUser(String email, String rawPassword) {
        User user = userRepository.findByEmail(email);

        if (user != null && passwordEncoder.matches(rawPassword, user.getPassword())) {
            return user;
        }

        return null;
    }

    // ---------- CHECK DUPLICATE EMAIL ----------
    public boolean emailExists(String email) {
        return userRepository.findByEmail(email) != null;
    }
}
