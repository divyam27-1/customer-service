package com.mphasis.csp.CustomerServicePortal.Repository;

import com.mphasis.csp.CustomerServicePortal.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}