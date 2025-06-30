package com.minierp.client_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "work_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

    @ManyToOne
    @JoinColumn(name = "transactor_id", nullable = false)
    private Transactors transactor;

    @ManyToOne
    @JoinColumn(name = "purchase_order_id", nullable = false)
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @JoinColumn(name = "purchase_part_details_id", nullable = false)
    private PurchasePartDetails purchasePartDetails;

    private Integer quantity;

    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private Status status;

    private int isDeleted = 0;
    private int isActive = 1;

    private LocalDateTime createdOn = LocalDateTime.now();
    private LocalDateTime modifiedOn = LocalDateTime.now();

    private String createdBy;
    private String modifiedBy;
}
