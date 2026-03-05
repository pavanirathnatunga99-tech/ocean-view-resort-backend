package com.oceanviewresort.controller;

import com.oceanviewresort.service.AuthService;

import org.springframework.web.bind.annotation.*;

/**
 * Controller for handling authentication operations.
 * Provides endpoints for user login and registration.
 * // Controller responsible for user authentication
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }
   // 🔹 TEST ENDPOINT (DEBUG ONLY)
    @GetMapping("/test")
    public String test() {
        return "Auth controller working";
    }

   // LOGIN
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {
        return service.login(username, password)
                ? "Login Successful"
                : "Invalid Credentials";
    }

    @PostMapping("/register")
    public String register(@RequestParam String username,
                           @RequestParam String password) {
        return service.register(username, password);
    }
}
