package com.patika.kredinbizdeservice.producer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.patika.kredinbizdeservice.producer.dto.Transaction;

@Service
@Slf4j
@Scope("singleton")
public class TransactionProducer {

    @Value(value = "${spring.kafka.producer.topic}")
    private String topicName;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public TransactionProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @SneakyThrows
    public void sendTransaction(final Transaction message) {
        kafkaTemplate.send(topicName, new ObjectMapper().writeValueAsString(message));
        log.info("Transaction published to Kafka");
    }
}