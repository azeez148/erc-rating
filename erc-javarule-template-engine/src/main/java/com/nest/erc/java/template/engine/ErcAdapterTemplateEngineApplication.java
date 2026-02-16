package com.nest.erc.java.template.engine;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.nest.erc.parser" })
public class ErcAdapterTemplateEngineApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ErcAdapterTemplateEngineApplication.class);
		app.run(args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		

	}

}
