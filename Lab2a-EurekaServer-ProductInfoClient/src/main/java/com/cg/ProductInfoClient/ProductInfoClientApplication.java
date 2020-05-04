package com.cg.ProductInfoClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.cg.ProductInfoClient")
public class ProductInfoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductInfoClientApplication.class, args);
		System.out.println("ProductInfoClient..is Running");
	}

}
