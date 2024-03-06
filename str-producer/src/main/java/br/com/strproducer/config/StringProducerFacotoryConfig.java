package br.com.strproducer.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class StringProducerFacotoryConfig {

    private final KafkaProperties properties;


}
