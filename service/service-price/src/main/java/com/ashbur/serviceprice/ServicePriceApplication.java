package com.ashbur.serviceprice;

import baseservice.configuration.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@Import(SwaggerConfiguration.class)
public class ServicePriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicePriceApplication.class, args);
    }

}
