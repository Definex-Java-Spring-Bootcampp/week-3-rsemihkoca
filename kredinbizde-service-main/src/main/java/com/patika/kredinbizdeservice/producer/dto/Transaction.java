package com.patika.kredinbizdeservice.producer.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@ToString
public class Transaction {
    private String errorMessage;
    private String sender;
    private String statusCode;
    private HttpStatus httpStatus;
    private long timestamp;
}