package com.rsemihkoca.orderservicemain.service;

import com.rsemihkoca.orderservicemain.model.Order;
import com.rsemihkoca.orderservicemain.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }


    public List<Order> getAll() {
        return orderRepository.getAll();
    }
}
