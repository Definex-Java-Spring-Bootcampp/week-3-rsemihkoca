package com.rsemihkoca.logconsumerservicemain.document;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.HttpStatus;

@Document(collection = "transactions")
public class Transaction {
    private String errorMessage;
    private String sender;
    private String statusCode;
    private HttpStatus httpStatus;
    private long timestamp;


    public Transaction(String errorMessage, String sender, String statusCode, HttpStatus httpStatus, long timestamp) {
        super();
        this.errorMessage = errorMessage;
        this.sender = sender;
        this.statusCode = statusCode;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }
}
