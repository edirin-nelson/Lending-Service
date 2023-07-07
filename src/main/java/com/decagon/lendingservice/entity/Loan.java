package com.decagon.lendingservice.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "loan")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanId;
    private String userId;
    private BigDecimal loanAmount;
    private String purpose;
    private BigDecimal interestRate;
    private int repaymentTerm;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Loan() {
    }

    public Loan(String userId, BigDecimal loanAmount, String purpose, BigDecimal interestRate,
                int repaymentTerm, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userId = generateUserId();
        this.loanAmount = loanAmount;
        this.purpose = purpose;
        this.interestRate = interestRate;
        this.repaymentTerm = repaymentTerm;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    private String generateUserId() {
        return UUID.randomUUID().toString();
    }
}
