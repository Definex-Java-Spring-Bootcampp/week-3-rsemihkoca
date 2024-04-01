package com.rsemihkoca.orderservicemain.model;


import lombok.*;
import com.rsemihkoca.orderservicemain.model.enums.OrderStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Order {

    private String userId;
    private String orderId;
    private Invoice invoice;
    private OrderStatus status = OrderStatus.PRE_ORDER;
}

