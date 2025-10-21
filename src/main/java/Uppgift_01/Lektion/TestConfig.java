package Uppgift_01.Lektion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    /* @Configuration?
     *   Expects one or more @Bean methods
     *   Avoids declaring new instantiated objects
     *   Directly works with IoC container
     *
     * */

    // Adds new Bean to IoC Container (Spring)
    @Bean
    public Student testStudentCreation() {
        return new Student("Benny");
    }
}
