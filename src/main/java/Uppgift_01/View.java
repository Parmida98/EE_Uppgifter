package Uppgift_01;

import org.springframework.web.bind.annotation.GetMapping;

public class View {
    @GetMapping("/view")
    public String view() {
        return "view.html";
    }
}
