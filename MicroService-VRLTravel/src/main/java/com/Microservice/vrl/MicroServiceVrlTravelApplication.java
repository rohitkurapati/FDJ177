package com.Microservice.vrl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroServiceVrlTravelApplication {

	public static void main(String[] args) {
		System.out.println("VRL Cliebnt");
		SpringApplication.run(MicroServiceVrlTravelApplication.class, args);
	}

}
