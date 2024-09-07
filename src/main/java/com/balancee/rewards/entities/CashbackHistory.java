package com.balancee.rewards.entities;

import java.util.Date;
import java.util.UUID;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CashbackHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID transactionID;


    @Column
    public Date transactionDate;

    @Column
    public double amountEarned;

    @Column
    public String description;  
    
    @ManyToOne
    @JoinColumn(name="customer_id")
    private CustomerRewards customerRewards;

    public CashbackHistory(double amountEarned, String description, Date transactionDate) {
        this.amountEarned = amountEarned;
        this.description = description;
        this.transactionDate = transactionDate;
    }


}
