package com.mphasis.csp.CustomerServicePortal.Controller;

import com.mphasis.csp.CustomerServicePortal.Entity.User;
import com.mphasis.csp.CustomerServicePortal.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AuthController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public String login(@RequestBody User request) {

        String token = service.login(request.getEmail(), request.getPassword());

        if (token != null) {
            return token;
        } else {
            return "Invalid Credentials";
        }

    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Welcome to dashboard!";
    }

}