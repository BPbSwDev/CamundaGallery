package com.example.servicetask.implementations;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("tweetAdapter")
public class TweetContentOfflineDelegate implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        String content = (String) execution.getVariable("content");

        System.out.println("\n\n\n######\n\n\n");
        System.out.println("NOW WE WOULD TWEET: '" + content + "'");
        System.out.println("\n\n\n######\n\n\n");
    }
}
