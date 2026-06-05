package com.mphasis.csp.CustomerServicePortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mphasis.csp.CustomerServicePortal.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailId(String emailId);
}