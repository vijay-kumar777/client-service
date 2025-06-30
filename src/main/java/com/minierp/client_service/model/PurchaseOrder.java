package com.minierp.client_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "purchase_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

    @ManyToOne
    @JoinColumn(name = "transaction_id", nullable = false)
    private Transactors transaction;

    private String transactionName;
    private String transactionAddress;
    private LocalDate orderDate;

    private int isDeleted = 0;
    private int isActive = 1;

    private LocalDateTime createdOn = LocalDateTime.now();
    private LocalDateTime modifiedOn = LocalDateTime.now();

    private String createdBy;
    private String modifiedBy;
}
