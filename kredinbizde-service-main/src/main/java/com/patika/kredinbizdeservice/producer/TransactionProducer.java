package com.patika.kredinbizdeservice.producer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.patika.kredinbizdeservice.producer.dto.Transaction;

@Service
@RequiredArgsConstructor
@Slf4j
public class TransactionProducerService {

    @Value(value = "${spring.kafka.template.default-topic}")
    private String defaultTopic;

    private final KafkaTemplate<String, String> kafkaTemplate;

    @SneakyThrows
    public void sendTransaction(final Transaction message) {
        kafkaTemplate.send(defaultTopic, new ObjectMapper().writeValueAsString(message));
        log.info("Transaction published to Kafka");
    }
}