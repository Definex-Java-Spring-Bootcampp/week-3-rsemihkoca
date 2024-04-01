package com.rsemihkoca.productservicemain.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rsemihkoca.productservicemain.dto.StockTransaction;
import com.rsemihkoca.productservicemain.model.Product;
import com.rsemihkoca.productservicemain.model.type.NonNegativeIntegerType;
import com.rsemihkoca.productservicemain.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class RabbitMQListener {

    private final ObjectMapper objectMapper;

    private final ProductService productService;


    @RabbitListener(queues = "${spring.rabbitmq.queue.increase}")
    public void increaseStock(String message) {
        StockTransaction stockTransaction;
        try {
            stockTransaction = objectMapper.readValue(message, StockTransaction.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        Product product = productService.getProductById(stockTransaction.getProductId());
        int newStock = product.getStock().getValue() + stockTransaction.getQuantity();
        product.setStock(new NonNegativeIntegerType(newStock));
    }

    @RabbitListener(queues = "${spring.rabbitmq.queue.decrease}")
    public void decreaseStock(String message) {
        StockTransaction stockTransaction;
        try {
            stockTransaction = objectMapper.readValue(message, StockTransaction.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        Product product = productService.getProductById(stockTransaction.getProductId());
        int newStock = product.getStock().getValue() - stockTransaction.getQuantity();
        product.setStock(new NonNegativeIntegerType(newStock));
    }

}
