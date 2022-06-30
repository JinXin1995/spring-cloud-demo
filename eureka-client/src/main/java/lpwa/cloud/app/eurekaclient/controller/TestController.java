package lpwa.cloud.app.eurekaclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String test(String name) {
        log.info("name is {}", name);
        return name + "=================" + port;
    }
}
