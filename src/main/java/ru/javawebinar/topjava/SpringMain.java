package ru.javawebinar.topjava;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javawebinar.topjava.repository.mock.MockUserRepositoryImpl;

import java.util.Arrays;

/**
 * Created by mega
 */
public class SpringMain {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");) {
            System.out.println("\n" + Arrays.toString(appCtx.getBeanDefinitionNames()) + "\n");
//        MockUserRepository mockUserRepository = (MockUserRepository) appCtx.getBean("MockUserRepository");
            MockUserRepositoryImpl mockUserRepository = appCtx.getBean(MockUserRepositoryImpl.class);
        } // end try()
    } // end main()
}
