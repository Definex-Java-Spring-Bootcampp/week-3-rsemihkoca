package com.rsemihkoca.productservicemain;

import com.rsemihkoca.productservicemain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@RequiredArgsConstructor
public class ProductServiceMainApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceMainApplication.class, args);
    }

    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        productRepository.initializeDatabase();
        System.out.println("Data Initialized...");
    }
}
