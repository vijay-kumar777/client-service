package com.minierp.client_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email_address", nullable = false, unique = true)
    private String emailAddress;

    @Column(nullable = false)
    private String password;

    private int isDeleted = 0;
    private int isActive = 1;

    private LocalDateTime createdOn = LocalDateTime.now();
    private LocalDateTime modifiedOn = LocalDateTime.now();

    private String createdBy;
    private String modifiedBy;
}
