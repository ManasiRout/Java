package com.example.Devops_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsHelloworldApplication.class, args);
		System.out.print("Hellow World by Java");
	}
}
