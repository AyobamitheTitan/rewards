package com.balancee.rewards.services;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.balancee.rewards.dtos.CashbackHistoryDto;
import com.balancee.rewards.repositories.CashbackHistoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CashbackHistoryService {
    private final CashbackHistoryRepository cashbackHistoryRepository;

    public List<CashbackHistoryDto> getCustomerCashbackHistory(UUID customerId){
        return this.cashbackHistoryRepository
                .findByCustomerRewardsCustomerId(customerId)
                .stream().map(cashbackHistory -> CashbackHistoryDto.mapCashbackHistoryToDto(cashbackHistory))
                .collect(Collectors.toList());
    }
}
