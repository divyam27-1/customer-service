package com.mphasis.csp.CustomerServicePortal.dto;

import com.mphasis.csp.CustomerServicePortal.enums.TicketCategory;
import com.mphasis.csp.CustomerServicePortal.enums.TicketSubcategory;
import lombok.Data;

@Data
public class RaiseTicketDTO {

    private Long userId;
    private TicketCategory category;
    private TicketSubcategory subcategory;
    private String description;
}
