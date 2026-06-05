package com.mphasis.csp.CustomerServicePortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mphasis.csp.CustomerServicePortal.model.Request;

public interface RequestRepository extends JpaRepository<Request, Long> {
}