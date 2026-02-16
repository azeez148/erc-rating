package com.nest.res.bop;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ResBOPApplication
{

public static void main(String[] args) {
		SpringApplication.run(ResBOPApplication.class, args);
	}

@GetMapping("/")
public String hello(String name)
{
   String res= "Hi" + name;
 System.out.println(res);
       return res;
}

}