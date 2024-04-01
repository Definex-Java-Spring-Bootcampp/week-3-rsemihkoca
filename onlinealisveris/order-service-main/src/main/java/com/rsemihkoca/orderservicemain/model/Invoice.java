package com.rsemihkoca.orderservicemain.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Invoice {

    private String id;
    private double total = 0;

    public void add(double amount) {
        total += amount;
    }

    private Invoice(String id) {
        this.id = id;
    }

}
