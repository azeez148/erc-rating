package com.nest.res;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
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