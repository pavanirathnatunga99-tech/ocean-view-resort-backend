package com.oceanviewresort.service;

import org.springframework.stereotype.Service;
import com.oceanviewresort.model.User;
import com.oceanviewresort.repository.UserRepository;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String username, String password) {

        User user = userRepository.findByUsername(username);

        if (user == null) {
            return false;
        }

        // Simple password check (no encryption)
        return user.getPassword().equals(password);
    }

    public String register(String username, String password) {

        if (username == null || password == null ||
            username.isBlank() || password.isBlank()) {
            return "Username and password required";
        }

        if (userRepository.existsByUsername(username)) {
            return "User already exists";
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password); // store plain password

        try {
            userRepository.save(user);
            return "User registered successfully";
        } catch (Exception e) {
            e.printStackTrace();
            return "Registration failed";
        }
    }
}
