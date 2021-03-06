package com.chris.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ConfigSpringMvcSecurityWithJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigSpringMvcSecurityWithJdbcApplication.class, args);
	}
}
