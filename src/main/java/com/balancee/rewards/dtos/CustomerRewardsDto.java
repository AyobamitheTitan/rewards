package com.balancee.rewards.dtos;

import java.util.UUID;

import com.balancee.rewards.entities.CustomerRewards;

import lombok.Data;

@Data
public class CustomerRewardsDto {
    public UUID customerID;
    public double totalCashBack;
    public double currentBalance;

    public static CustomerRewardsDto mapCustomerRewardsToDto(CustomerRewards customerRewards){
        CustomerRewardsDto customerRewardsDto = new CustomerRewardsDto();
        customerRewardsDto.setCustomerID(customerRewards.getCustomerId());
        customerRewardsDto.setTotalCashBack(customerRewards.getTotalCashBack());
        customerRewardsDto.setCurrentBalance(customerRewards.getCurrentBalance());

        return customerRewardsDto; 
    }
}
