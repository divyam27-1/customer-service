package com.mphasis.csp.CustomerServicePortal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RequestsController {

    @PostMapping("/raiseTicket")
    public ResponseEntity<String> raiseTicket(@RequestBody String request) {
        // Service Layer
        return ResponseEntity.ok("Ticket Raised Successfully");
    }

    @PutMapping("/editTicket")
    public ResponseEntity<String> editTicket(@RequestBody String request) {
        // Service Layer
        return ResponseEntity.ok("Ticket Edited Successfully");
    }
}
