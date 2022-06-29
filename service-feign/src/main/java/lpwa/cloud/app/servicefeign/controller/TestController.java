package lpwa.cloud.app.servicefeign.controller;

import lpwa.cloud.app.servicefeign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/test1")
    public String test(String name) {
        return testService.getByClientOne(name);
    }
}
