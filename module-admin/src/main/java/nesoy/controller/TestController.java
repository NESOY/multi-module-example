package nesoy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/admin")
    public void test() {
        System.out.println("hello admin Test api");
    }
}
