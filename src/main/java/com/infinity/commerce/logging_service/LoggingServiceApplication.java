package com.infinity.commerce.logging_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class LoggingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingServiceApplication.class, args);
	}

}
