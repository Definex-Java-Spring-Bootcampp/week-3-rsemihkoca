package com.rsemihkoca.productservicemain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductServiceMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceMainApplication.class, args);
    }

}
