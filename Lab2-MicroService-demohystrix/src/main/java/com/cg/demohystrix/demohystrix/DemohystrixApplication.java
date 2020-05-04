package com.cg.demohystrix.demohystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class DemohystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemohystrixApplication.class, args);
		System.out.println("Hystrix Running..");
	}

}
