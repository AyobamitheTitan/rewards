package com.balancee.rewards.data;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Date;
import com.balancee.rewards.repositories.CashbackHistoryRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import com.balancee.rewards.entities.CashbackHistory;


@Component
@RequiredArgsConstructor
public class CashbackHistorySeeder implements CommandLineRunner {
    private final CashbackHistoryRepository cashbackHistoryRepository;

    @Override
    public void run(String[] args) throws Exception{

        cashbackHistoryRepository.saveAll(List.of(
            new CashbackHistory(4350.9,"",new Date()),
            new CashbackHistory(430.2,"",new Date()),
            new CashbackHistory(350.01,"",new Date())
        ));
    }
}
