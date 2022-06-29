package lpwa.cloud.app.servicefeign.service.fallback;

import lpwa.cloud.app.servicefeign.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestServiceFallback implements TestService {
    @Override
    public String getByClientOne(String name) {
        return name + " error!";
    }
}
