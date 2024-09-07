package com.balancee.rewards.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.balancee.rewards.dtos.CustomerRewardsDto;
import com.balancee.rewards.repositories.CustomerRewardsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerRewardsService {
    private final CustomerRewardsRepository customerRewardsRepository;

    public Optional<CustomerRewardsDto> getRewardsBalance(UUID customerId){
        return this.customerRewardsRepository.findById(customerId).map(CustomerRewardsDto::mapCustomerRewardsToDto);
    }
}
