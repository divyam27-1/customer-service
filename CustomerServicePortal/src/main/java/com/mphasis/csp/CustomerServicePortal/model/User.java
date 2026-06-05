
package com.mphasis.csp.CustomerServicePortal.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String role;
}
