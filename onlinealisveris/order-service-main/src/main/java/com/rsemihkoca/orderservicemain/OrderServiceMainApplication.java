package com.rsemihkoca.orderservicemain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderServiceMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceMainApplication.class, args);
    }

}
