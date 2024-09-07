package com.balancee.rewards.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balancee.rewards.entities.CashbackHistory;

/**
 * CashbackHistoryRepository
 */
public interface CashbackHistoryRepository extends JpaRepository<CashbackHistory, UUID>{
    List<CashbackHistory> findByCustomerRewardsCustomerId(UUID customerId); 
}