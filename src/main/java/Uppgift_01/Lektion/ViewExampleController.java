package Uppgift_01.Lektion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewExampleController {

    private final TestService testService;

    // Constructor - MUST BE AUTOWIRED (1 param = autowiring isn't required)
    @Autowired
    public ViewExampleController(TestService testService) {
        this.testService = testService;
    }


    // TODO - What will this method ACTUALLY return?
    //  ResponseBody != used (JSON)
    // What we know so far... It's not JSON, it's not Rest (API/WS), and it works
    // with UI... What view?
    @GetMapping("/hello")
    public String testView() {

        return "Hello.html"; // .html is required (but can be excluded in thymeleaf)
    }
}
