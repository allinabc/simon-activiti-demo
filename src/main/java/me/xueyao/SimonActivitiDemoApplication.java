package me.xueyao;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SimonActivitiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimonActivitiDemoApplication.class, args);
    }

    //@Bean
    /*public CommandLineRunner init(final RepositoryService repositoryService,
                                  final RuntimeService runtimeService,
                                  final TaskService taskService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                *//*System.out.println("Number of process definitions:"+repositoryService.createProcessDefinitionQuery().count());
                System.out.println("Number of tasks:"+taskService.createTaskQuery().count());
                runtimeService.startProcessInstanceByKey("oneTaskProcess");
                System.out.println("Number of tasks after process start:"+taskService.createTaskQuery().count());*//*


            }
        };

    }*/

}
