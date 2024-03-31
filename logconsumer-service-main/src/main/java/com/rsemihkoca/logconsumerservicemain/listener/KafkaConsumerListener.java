package com.rsemihkoca.logconsumerservicemain.listener;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rsemihkoca.logconsumerservicemain.repository.TransactionRepository;
import com.rsemihkoca.logconsumerservicemain.document.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerListener {

    @Autowired
    private final TransactionRepository transactionRepository;

    public KafkaConsumerListener(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.group-id}")
    public void listen(String message) {
        System.out.printf("Received Messasge: [%s] %n", message);
        try {
            Transaction transaction = new ObjectMapper().readValue(message, Transaction.class);
            Transaction save = transactionRepository.save(transaction);
            System.out.println("Transaction saved to MongoDB" + save);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}