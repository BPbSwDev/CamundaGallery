package com.example.servicetask.implementations;

import java.net.UnknownHostException;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class TweetContentDelegate implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        String content = (String) execution.getVariable("content");

        // Force a network error
        if ("network error".equals(content)) {
            throw new UnknownHostException("demo twitter account");
        }

    }
}
