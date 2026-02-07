package com.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSIcurityApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSIcurityApp1Application.class, args);
	}

}
