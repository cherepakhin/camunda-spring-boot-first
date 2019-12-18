## Старт с Camunda и Spring Boot

[Источник](https://docs.camunda.org/get-started/spring-boot/)

Пример показывает запуск простейшего camunda-процесса.

![Схема](doc/process_request.png "Схема")

Выполнен в виде war-файла.

```java
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

```

После деплоя, перейти по ссылке
[http://127.0.0.1:8080/spring-boot-first-1](http://127.0.0.1:8080/spring-boot-first-1)