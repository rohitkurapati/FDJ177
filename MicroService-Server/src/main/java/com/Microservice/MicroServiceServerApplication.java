package com.Microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MicroServiceServerApplication {

	public static void main(String[] args) {
		System.out.println("This is MicroService server");
		SpringApplication.run(MicroServiceServerApplication.class, args);
	}

}
