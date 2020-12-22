package me.xueyao;

import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class SimonActivitiDemoApplicationTests {

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;

    //开始流程
    @Test
    public void createInstanceTest() {
        runtimeService.startProcessInstanceByKey("holiday");
    }

    //查询待办任务
    @Test
    public void queryTasksTest() {
        //List<Task> taskList = taskService.createTaskQuery().taskAssignee("张三").list();
        //List<Task> taskList = taskService.createTaskQuery().taskAssignee("李四").list();
        List<Task> taskList = taskService.createTaskQuery().taskAssignee("王五").list();
        taskList.forEach(task -> {
            log.info("Assignee:{}",task.getAssignee());
            log.info("Id:{}",task.getId());
            log.info("Name:{}",task.getName());
            log.info("category:{}",task.getCategory());
        });
    }

    //审核
    @Test
    public void processTaskTest() {
        //String id = "30005";
        //String id = "32502";
        String id = "47502";
        taskService.complete(id);
    }

}
