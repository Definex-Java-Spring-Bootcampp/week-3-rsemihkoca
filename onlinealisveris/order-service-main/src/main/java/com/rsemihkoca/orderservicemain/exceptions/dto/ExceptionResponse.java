package com.rsemihkoca.orderservicemain.exceptions.dto;

import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExceptionResponse {

    private String message;
    private HttpStatus httpStatus;

}
