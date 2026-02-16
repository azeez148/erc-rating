package com.nest.erc.adapter.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@ComponentScan(basePackages = "com.nest.erc.adapter")
@RestController
public class ErcAdapterGatewayApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ErcAdapterGatewayApplication.class, args);
	}

}
