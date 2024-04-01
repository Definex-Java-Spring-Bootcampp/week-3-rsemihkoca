package com.rsemihkoca.ordermanagementservice.controller;


import com.rsemihkoca.orderservicemain.model.Order;
import com.rsemihkoca.orderservicemain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("api/onlinealisveris/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody Order request) {
        return orderService.createOrder(request);
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAll() {
        return ResponseEntity.ok(orderService.getAll());
    }

    @GetMapping("errorTest")
    public ResponseEntity<List<Order>> testKafka() {
        throw new RuntimeException("test exception");
    }

}
