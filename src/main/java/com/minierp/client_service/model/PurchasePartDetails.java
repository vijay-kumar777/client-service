package com.minierp.client_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "purchase_part_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchasePartDetails {

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

    private Integer lineNum;

    private String partName;
    private String partNum;
    private String diagramNum;

    @Column(columnDefinition = "TEXT")
    private String diagram;

    private LocalDate expectedCompletionDate;

    private Integer quantity;

    @Column(precision = 12, scale = 2)
    private Double price;

    private int isDeleted = 0;
    private int isActive = 1;

    private LocalDateTime createdOn = LocalDateTime.now();
    private LocalDateTime modifiedOn = LocalDateTime.now();

    private String createdBy;
    private String modifiedBy;
}
