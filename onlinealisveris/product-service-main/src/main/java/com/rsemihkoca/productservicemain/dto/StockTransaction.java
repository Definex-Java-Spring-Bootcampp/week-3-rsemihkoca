package com.rsemihkoca.productservicemain.dto;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.HttpStatus;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class StockTransaction {
    private String productId;
    private Integer quantity;
}
