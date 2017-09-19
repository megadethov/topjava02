package ru.javawebinar.topjava.web;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import ru.javawebinar.topjava.Profiles;
import ru.javawebinar.topjava.web.meal.UserMealRestController;

import java.util.Arrays;

/**
 * Created by mega
 */
public class SpringMain {
    public static void main(String[] args) {
        // java 7 Automatic resource management
//        try (ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml","spring/mock.xml")) {
        try (GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.getEnvironment().setActiveProfiles(Profiles.POSTGRES);
            ctx.load("spring/spring-app.xml", "spring/mock.xml");
            ctx.refresh();
            System.out.println("\n" + Arrays.toString(ctx.getBeanDefinitionNames()) + "\n");
            UserMealRestController adminController = ctx.getBean(UserMealRestController.class);
            adminController.delete(7);
        }
    }
}
