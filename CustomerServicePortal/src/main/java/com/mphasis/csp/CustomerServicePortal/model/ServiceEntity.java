package com.mphasis.csp.CustomerServicePortal.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "services")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;

    private Long ticketId;

    private String serviceType;
    private String comment;
    private String oldStatus;
    private String newStatus;

    private LocalDateTime dateOfService;
    private Long croId;
}