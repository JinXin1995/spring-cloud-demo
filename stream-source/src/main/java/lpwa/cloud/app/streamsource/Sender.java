package lpwa.cloud.app.streamsource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

@Configuration
public class Sender {
    private static final Logger log = LoggerFactory.getLogger(Sender.class);

    @Bean
//    @InboundChannelAdapter(value = "send", poller = @Poller(fixedDelay = "2000"))
    public Supplier<String> input() {
        return () -> {
            String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            log.info("send message: {}", str);
            return str;
        };
    }

    @Bean
//    @InboundChannelAdapter(value = "send", poller = @Poller(fixedDelay = "2000"))
    public Supplier<String> test6() {
        return () -> {
            String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            log.info("send test6 message: {}", str);
            return str;
        };
    }
}
