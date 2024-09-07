package com.balancee.rewards.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRewards {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID customerId;

    @Column
    public double totalCashBack;

    @Column
    public double currentBalance;

    @OneToMany(mappedBy= "customerRewards", cascade=CascadeType.ALL)
    private List<CashbackHistory> cashbackHistory = new ArrayList<CashbackHistory>();

    public CustomerRewards(double currentBalance, double totalCashBack) {
        this.currentBalance = currentBalance;
        this.totalCashBack = totalCashBack;
    }
}
