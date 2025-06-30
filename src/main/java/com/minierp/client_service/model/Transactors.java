package com.minierp.client_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "transactors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transactors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

    private String name;
    private String title;
    private String address;
    private String state;
    private String city;

    private int isDeleted = 0;
    private int isActive = 1;

    private LocalDateTime createdOn = LocalDateTime.now();
    private LocalDateTime modifiedOn = LocalDateTime.now();

    private String createdBy;
    private String modifiedBy;
}
