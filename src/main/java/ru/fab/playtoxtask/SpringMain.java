package ru.fab.playtoxtask;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.fab.playtoxtask.web.UserController;

import java.util.Arrays;

/**
 * Created by r22fab21051979 on 25.01.2018.
 */
public class SpringMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println("\n" + Arrays.toString(appCtx.getBeanDefinitionNames()) + "\n");

        UserController controller = appCtx.getBean(UserController.class);

        System.out.println(controller.getService());
        appCtx.close();
    }
}
