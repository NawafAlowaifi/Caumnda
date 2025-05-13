package com.example.testproject.repository;

import com.example.testproject.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    List<Subscription> getSubscriptionById(Long id);
}
