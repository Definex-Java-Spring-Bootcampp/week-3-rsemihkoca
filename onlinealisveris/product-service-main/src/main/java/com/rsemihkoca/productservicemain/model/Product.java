package com.rsemihkoca.productservicemain.model;

import com.rsemihkoca.productservicemain.model.enums.Category;
import com.rsemihkoca.productservicemain.model.type.NonNegativeIntegerType;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Product {
    private String productId;
    private String name;
    private double price;
    private NonNegativeIntegerType stock;
    private Category category;

}




