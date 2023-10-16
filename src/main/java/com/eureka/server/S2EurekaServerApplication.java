package com.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class S2EurekaServerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(S2EurekaServerApplication.class, args);
	}

}
