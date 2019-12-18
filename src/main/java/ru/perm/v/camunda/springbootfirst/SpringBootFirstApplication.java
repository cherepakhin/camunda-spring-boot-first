package ru.perm.v.camunda.springbootfirst;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

@EnableProcessApplication
@SpringBootApplication
public class SpringBootFirstApplication {

	@Autowired
	private RuntimeService runtimeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstApplication.class, args);
	}

	@EventListener
	private void processPostDeploy(PostDeployEvent event) {
		// "process_request" - ID процесса в modeler
		runtimeService.startProcessInstanceByKey("process_request");
	}

}
