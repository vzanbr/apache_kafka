package br.com.strproducer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class StringProducerService {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Send Message {}", message);
        kafkaTemplate.send("str-topic", message);
//                .addCallback(
//                success -> {
//                    if(success != null) {
//                        log.info("Send message with sucess {}", message);
//                        log.info("Partition {} , Offset {}",
//                                success.getRecordMetadata().partition(),
//                                success.getRecordMetadata().offset());
//                    }
//                },
//                error -> log.info("Error send message")
//        );
//
    }
}
