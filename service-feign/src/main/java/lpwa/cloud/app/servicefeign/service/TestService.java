package lpwa.cloud.app.servicefeign.service;

import lpwa.cloud.app.servicefeign.service.fallback.TestServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = TestServiceFallback.class)
public interface TestService {
    @GetMapping("/test")
    String getByClientOne(@RequestParam("name")String name);
}
