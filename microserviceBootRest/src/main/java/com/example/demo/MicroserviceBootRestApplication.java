package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class MicroserviceBootRestApplication extends SpringBootServletInitializer{

	/**
	 * Running as jar
	 */	
	
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBootRestApplication.class, args);
	}

	/**
	 * Running as war
	 */
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroserviceBootRestApplication.class);
	}
	
	
	

}
