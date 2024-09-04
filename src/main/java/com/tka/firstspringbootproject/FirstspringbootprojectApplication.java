package com.tka.firstspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FirstspringbootprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstspringbootprojectApplication.class, args);
	}

	@Bean
	@Primary
	@Scope("singleton")
	demo createobex() {
		demo xxxx = new demo();
		return xxxx;
	}

}
