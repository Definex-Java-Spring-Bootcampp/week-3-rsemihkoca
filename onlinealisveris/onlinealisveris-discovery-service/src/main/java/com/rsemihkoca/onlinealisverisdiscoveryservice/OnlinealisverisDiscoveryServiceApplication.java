package com.rsemihkoca.onlinealisverisdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlinealisverisDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlinealisverisDiscoveryServiceApplication.class, args);
    }

}
