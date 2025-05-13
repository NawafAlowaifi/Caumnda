package com.example.testproject.delegate;

import com.example.testproject.service.SubscriptionService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ActivateSubscriptionTask implements JavaDelegate {

    private final SubscriptionService subscriptionService;

    public ActivateSubscriptionTask(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @Override
    public void execute(DelegateExecution execution) {
        String userId = (String) execution.getVariable("userId");
        subscriptionService.activateSubscription(userId);
    }
}
