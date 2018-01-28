package ru.fab.playtoxtask;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.fab.playtoxtask.web.UserController;

import java.util.Arrays;

public class SpringMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println("\n" + Arrays.toString(appCtx.getBeanDefinitionNames()) + "\n");

        UserController controller = appCtx.getBean(UserController.class);

        //System.out.println(controller.getService());
        System.out.println(controller.get(1));
        appCtx.close();
    }
}
