package com.decagon.lendingservice.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table (name = "investment_prefere")
public class InvestmentPreference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int preference_id;
    private BigDecimal loanAmount;
    private BigDecimal interestRate;
    private int riskTolerance;
    private int durationInDays;
}
