package com.mphasis.csp.CustomerServicePortal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mphasis.csp.CustomerServicePortal.dto.RegisterRequest;
import com.mphasis.csp.CustomerServicePortal.model.User;
import com.mphasis.csp.CustomerServicePortal.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User register(RegisterRequest req) {


        if (!req.getPassword().equals(req.getConfirmPassword())) {
            throw new RuntimeException("Passwords do not match");
        }

        if (repo.findByEmailId(req.getEmail()).isPresent()) {
            throw new RuntimeException("Email exists");
        }


        User user = new User();

        user.setUsername(req.getName());
        user.setEmailId(req.getEmail());
        user.setFirstName(req.getName());

        user.setPasswordHash(encoder.encode(req.getPassword())); // ✅ encrypted password
        user.setRole("CUSTOMER");

        // ✅ ADD THESE (IMPORTANT 🔥)
        user.setLastName(req.getLastName());
        user.setPhoneNo(req.getPhoneNo());

        return repo.save(user);
    }
}