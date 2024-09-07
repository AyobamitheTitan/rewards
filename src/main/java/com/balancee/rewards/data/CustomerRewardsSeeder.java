package com.balancee.rewards.data;

import org.springframework.stereotype.Component;
import java.util.List;

import com.balancee.rewards.repositories.CustomerRewardsRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import com.balancee.rewards.entities.CustomerRewards;

@Component
@RequiredArgsConstructor
public class CustomerRewardsSeeder implements CommandLineRunner {
    private final CustomerRewardsRepository customerRewardsRepository;


    @Override
    public void run(String[] args) throws Exception{
        customerRewardsRepository.saveAll(List.of(
            new CustomerRewards(50000.45,4000.90),
            new CustomerRewards(50000.45,4000.90),
            new CustomerRewards(50000.45,4000.90)
        ));
    }
}
