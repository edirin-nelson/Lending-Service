package com.decagon.lendingservice.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Lender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lender_id;

    @OneToOne
    private User user_id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
