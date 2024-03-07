package br.com.strconsumer.listeners;

import br.com.strconsumer.custom.StrConssumerCustomListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListeners {

    @StrConssumerCustomListener(groupId = "group-0")
    public void create(String message) throws Exception {
       log.info("CREATE ::: Recive message {}", message);
       throw new IllegalArgumentException("EXCEPTION...");
    }

    @StrConssumerCustomListener(groupId = "group-1")
    public void log(String message) {
        log.info("LOG ::: Recive message {}", message);
    }

    @KafkaListener(groupId = "group-2", topics = "str-topic" ,containerFactory = "validMessageContainerFactory")
    public void history(String message) {
        log.info("HISTORY ::: Recive message {}", message);
    }
}
