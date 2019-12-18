package ru.perm.v.camunda.springbootfirst;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessRequestDelegate implements JavaDelegate {

  private final static Logger LOGGER = LoggerFactory.getLogger(ProcessRequestDelegate.class);

  public void execute(DelegateExecution execution) throws Exception {
    LOGGER.info("Processing request by '" + execution.getVariable("customerId") + "'...");
  }
}
