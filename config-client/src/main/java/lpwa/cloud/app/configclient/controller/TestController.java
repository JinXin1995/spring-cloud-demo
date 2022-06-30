package lpwa.cloud.app.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${foo}")
    String foo;

    @GetMapping("/test")
    public String test() {
        return foo;
    }
}
