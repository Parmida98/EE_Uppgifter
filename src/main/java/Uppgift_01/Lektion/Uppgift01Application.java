package Uppgift_01.Lektion;

import Uppgift_01.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Uppgift01Application {

    public static void main(String[] args) {
        ApplicationContext apc = SpringApplication.run(Uppgift01Application.class, args);

        // ApplicationContext (Bean factory methods for accessing application components) IoC
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                TestConfig.class
        );

        Student student = applicationContext.getBean("testStudentCreation", Student.class);

        System.out.println(student.getUserName());

        // Get ALL beans in IoC (spring)
        for(String s: apc.getBeanDefinitionNames()) {
            System.out.println(s);
        }
    }
}
