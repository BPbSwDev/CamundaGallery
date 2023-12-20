package com.example.sendtask.implementations;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class LoggerDelegate implements JavaDelegate {
    private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());


    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("\n\n .. LoggerDelegate invoked by"
                +"processDefinitionId="+execution.getProcessInstanceId()
                +", activityId= "+execution.getCurrentActivityId()
                +", activityName= "+execution.getCurrentActivityName()
                +", processInstanceId= "+execution.getProcessInstanceId()
                +", businessKey= "+execution.getBusinessKey()
                +", executionId= "+execution.getId());
    }
}
