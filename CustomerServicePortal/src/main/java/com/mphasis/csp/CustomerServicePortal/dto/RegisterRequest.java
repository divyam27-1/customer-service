package com.mphasis.csp.CustomerServicePortal.dto;

import lombok.Data;

@Data
public class RegisterRequest {

    private String name;
    private String email;
    private String password;
    private String confirmPassword;

    private String phoneNo;
    private String lastName;

}