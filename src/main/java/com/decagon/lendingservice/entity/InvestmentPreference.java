package com.decagon.lendingservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "investment_preference")
public class InvestmentPreference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "loan_amount")
    private BigDecimal loanAmount;
    @Column(name = "interest_rate")
    private BigDecimal interestRate;
    @Column(name = "risk_tolerance")
    private int riskTolerance;
    @Column(name = "duration_in_days")
    private int durationInDays;

//    public InvestmentPreference() {
//    }
//
//    public InvestmentPreference(BigDecimal loanAmount, BigDecimal interestRate, int riskTolerance, int durationInDays) {
//        this.loanAmount = loanAmount;
//        this.interestRate = interestRate;
//        this.riskTolerance = riskTolerance;
//        this.durationInDays = durationInDays;
//    }
}
