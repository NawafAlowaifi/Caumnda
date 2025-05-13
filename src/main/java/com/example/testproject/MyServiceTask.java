package com.example.testproject;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class MyServiceTask implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println(">>> Service task logic is running");
        execution.setVariable("result", "success");
    }
}

