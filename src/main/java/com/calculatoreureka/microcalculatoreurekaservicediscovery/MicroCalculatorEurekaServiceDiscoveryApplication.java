package com.calculatoreureka.microcalculatoreurekaservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroCalculatorEurekaServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCalculatorEurekaServiceDiscoveryApplication.class, args);
	}

}
