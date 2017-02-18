package ru.javawebinar.topjava;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javawebinar.topjava.repository.mock.MockUserRepository;

import java.util.Arrays;

/**
 * Created by mega
 */
public class SpringMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println(Arrays.toString(appCtx.getBeanDefinitionNames()));
//        MockUserRepository mockUserRepository = (MockUserRepository) appCtx.getBean("MockUserRepository");
        MockUserRepository mockUserRepository = appCtx.getBean(MockUserRepository.class);
        appCtx.close();
    }
}
