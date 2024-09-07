package com.balancee.rewards.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balancee.rewards.entities.CustomerRewards;

/**
 * CustomerRewardsRepository
 */
public interface CustomerRewardsRepository extends JpaRepository<CustomerRewards, UUID> {

    
}