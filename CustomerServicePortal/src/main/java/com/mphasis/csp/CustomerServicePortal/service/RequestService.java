
package com.mphasis.csp.CustomerServicePortal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.csp.CustomerServicePortal.model.Request;
import com.mphasis.csp.CustomerServicePortal.repository.RequestRepository;

import java.time.LocalDateTime;

@Service
public class RequestService {

    @Autowired
    private RequestRepository repo;

    public Request createRequest(Request req) {

        req.setStatus("OPEN");
        req.setDateOfSubmission(LocalDateTime.now());

        return repo.save(req);
    }
}