package Uppgift_01;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Primary - “Om det finns flera av samma typ – välj den här först.”

@Profile("prod")
@Service
public class JpaStudentService implements StudentService
{
    @Override
    public String getStudentInfo(Long id) {
        return "Hello from JPA (id = " + id + ")";
    }
}
