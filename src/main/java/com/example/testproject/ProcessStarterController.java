package com.example.testproject;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class ProcessStarterController {

    @Autowired
    private RuntimeService runtimeService;

    @GetMapping("/service-task")
    public String startProcess() {
        ProcessInstance instance = runtimeService.startProcessInstanceByKey("test-service-task");
        return "Started process instance: " + instance.getId();
    }
}
