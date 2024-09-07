package com.balancee.rewards.dtos;

import java.util.Date;
import java.util.UUID;

import com.balancee.rewards.entities.CashbackHistory;

import lombok.Data;

@Data
public class CashbackHistoryDto {
    public UUID transactionID;
    public double amountEarned;
    public String description;
    public Date transactionDate;

    public static CashbackHistoryDto mapCashbackHistoryToDto(CashbackHistory cashbackHistory){
        CashbackHistoryDto cashbackHistoryDto = new CashbackHistoryDto();
        
        cashbackHistoryDto.setTransactionID(cashbackHistory.getTransactionID());
        cashbackHistoryDto.setAmountEarned(cashbackHistory.getAmountEarned());
        cashbackHistoryDto.setDescription(cashbackHistory.getDescription());
        cashbackHistoryDto.setTransactionDate(cashbackHistory.getTransactionDate());
        return cashbackHistoryDto;
    }
}
