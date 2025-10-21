package Uppgift_01;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev") /* @Profile används för att tala om vilken miljö eller version av koden som ska köras i Spring.
Det hjälper dig att ha olika inställningar för utveckling, test och produktion — utan att ändra i koden. */
@Service
public class InMemoryStudentService implements StudentService {
    @Override
    public String getStudentInfo(Long id) {
        return "Hello from InMemory (id = " + id + ")";
    }
}
