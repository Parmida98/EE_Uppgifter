package Uppgift_01.Lektion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Types that carry this annotation are treated as controllers where
// @RequestMapping methods assume @ResponseBody semantics by default.
@RestController
@RequestMapping("/api/v1/test") // Subsequent mappings, receive this Endpoint (Default json)
public class TestController {

    // GetMapping didn't use to exist in prior spring versions...
    @GetMapping("/banana") // localhost:8080/api/v1/test/banana (Inherits requestMapping endpoint)
    public void test() {}
}
