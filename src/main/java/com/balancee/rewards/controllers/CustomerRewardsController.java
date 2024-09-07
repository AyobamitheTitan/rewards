package com.balancee.rewards.controllers;

import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.balancee.rewards.dtos.CustomerRewardsDto;
import com.balancee.rewards.services.CustomerRewardsService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/rewards/balance")
@RequiredArgsConstructor
public class CustomerRewardsController {
    private final CustomerRewardsService customerRewardsService;

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerRewardsDto> getCustomerRewards(@PathVariable UUID customerId){
        Optional<CustomerRewardsDto> customerRewards = this.customerRewardsService
                .getRewardsBalance(customerId);

        if (!customerRewards.isPresent()){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .build();
        }
        return ResponseEntity.ok(customerRewards.get());
    }
}
