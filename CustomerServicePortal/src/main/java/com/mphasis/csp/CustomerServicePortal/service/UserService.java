package com.mphasis.csp.CustomerServicePortal.Service;

import com.mphasis.csp.CustomerServicePortal.Entity.User;
import com.mphasis.csp.CustomerServicePortal.Repository.UserRepository;
import com.mphasis.csp.CustomerServicePortal.Security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private JwtUtil jwtUtil;

    public String login(String email, String password) {

        User user = repo.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            return jwtUtil.generateToken(email);
        }

        return null;
    }
}