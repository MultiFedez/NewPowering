package com.powering.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.powering.spring")
public class PoweringSrl1Application {

	public static void main(String[] args) {
		SpringApplication.run(PoweringSrl1Application.class, args);
	}

}
