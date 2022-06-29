package lpwa.cloud.app.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-client")
public interface TestService {
    @GetMapping("/test")
    String getByClientOne(@RequestParam("name")String name);
}
