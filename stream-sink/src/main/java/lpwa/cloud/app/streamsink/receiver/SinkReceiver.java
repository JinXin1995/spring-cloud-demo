package lpwa.cloud.app.streamsink.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class SinkReceiver {

    private static final Logger log = LoggerFactory.getLogger(SinkReceiver.class);

    @Bean(name = "input")
    Consumer<String> input() {
        return str -> log.info("Received: {}", str);
    }

    @Bean(name = "test6")
    Consumer<String> test6() {
        return str -> log.info("Test6 Received: {}", str);
    }
}
