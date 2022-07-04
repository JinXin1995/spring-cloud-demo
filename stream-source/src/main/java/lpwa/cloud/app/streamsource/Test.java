package lpwa.cloud.app.streamsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
public class Test {
    @Autowired
    private StreamBridge streamBridge;

    public void sendMessage() {
        streamBridge.send("test6-out-0", "Helllo");
    }
}
