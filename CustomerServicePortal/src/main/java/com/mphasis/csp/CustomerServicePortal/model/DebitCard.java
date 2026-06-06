package com.mphasis.csp.CustomerServicePortal.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "debit_cards")
public class DebitCard {

    @Id
    private String debitCardNumber;

    private Long userId;

    private String status;
}