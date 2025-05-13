package com.example.testproject.Controller;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionController {

    private final RuntimeService runtimeService;

    public SubscriptionController(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @PostMapping("/start")
    public String startSubscription(@RequestParam String userId) {
        Map<String, Object> vars = new HashMap<>();
        vars.put("userId", userId);
        runtimeService.startProcessInstanceByKey("subscription-process", vars);
        return "Process started for user: " + userId;
    }
}
