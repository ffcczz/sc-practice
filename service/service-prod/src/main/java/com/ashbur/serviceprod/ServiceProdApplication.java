package com.ashbur.serviceprod;

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
public class ServiceProdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProdApplication.class, args);
    }

}
