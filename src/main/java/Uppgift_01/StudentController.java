package Uppgift_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final StudentService studentService; // interface
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/student")
    public String getStudent() {
        return studentService.getStudentInfo(1L);
    }
}

/* Vilken service kördes, och varför just den?
Hello from JPA (id = 1) kom upp. Har @Primary och det betyder att just den går först, om det finns fler.
Efter ändring till @Profile, blev det Hello from InMemory (id = 1)
 */
