package com.example.sendtask.implementations;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("sendHelpRequest")
public class SendNotificationDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Envio de mensaje de ayuda");
        System.out.println(execution.getVariable("mensaje"));
    }
}
