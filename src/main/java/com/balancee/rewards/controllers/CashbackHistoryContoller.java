package com.balancee.rewards.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balancee.rewards.dtos.CashbackHistoryDto;
import com.balancee.rewards.services.CashbackHistoryService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/rewards/history")
@RequiredArgsConstructor
public class CashbackHistoryContoller {
    private final CashbackHistoryService cashbackHistoryService;

    @GetMapping("/{customerId}")
    public ResponseEntity<List<CashbackHistoryDto>> getCashbackHistory(@PathVariable UUID customerId){
        List<CashbackHistoryDto> cashbackHistory = this.cashbackHistoryService.getCustomerCashbackHistory(customerId);
        
        return new ResponseEntity<>(cashbackHistory, HttpStatus.OK);
    }
}
