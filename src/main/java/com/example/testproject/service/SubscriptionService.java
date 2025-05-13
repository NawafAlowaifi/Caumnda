package com.example.testproject.service;

import com.example.testproject.entity.Subscription;
import com.example.testproject.repository.SubscriptionRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;


@Service
public class SubscriptionService {

    private final SubscriptionRepository repository;

    public SubscriptionService(SubscriptionRepository repository) {
        this.repository = repository;
    }
    @Transactional
    public void activateSubscription(String userId) {
        Subscription sub = new Subscription();

        sub.setUserId(userId);
        sub.setActive(true);
        sub.setSubscribedAt(LocalDateTime.now());
        repository.save(sub);
        repository.flush();
        repository.getSubscriptionById(sub.getId());



    }
}
