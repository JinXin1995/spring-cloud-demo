package lpwa.cloud.app.serviceribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lpwa.cloud.app.serviceribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "error")
    public String test(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/test?name=" + name, String.class);
    }

    public String error(String name) {
        return name + " error!";
    }
}
