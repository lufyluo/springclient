package com.example.eureka.userprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserproviderApplication.class, args);
	}

}
