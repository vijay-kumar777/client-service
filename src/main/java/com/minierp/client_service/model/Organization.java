package com.minierp.client_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "organization")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String title;
    private String logo;
    private String address;
    private String email;
    private String phone;
    private String gst;

    private int isDeleted = 0;
    private int isActive = 1;

    private LocalDateTime createdOn = LocalDateTime.now();
    private LocalDateTime modifiedOn = LocalDateTime.now();

    private String createdBy;
    private String modifiedBy;
}
