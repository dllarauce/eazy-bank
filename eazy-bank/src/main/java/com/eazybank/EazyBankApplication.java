package com.eazybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.com.eazybank.controller"), 
	@ComponentScan("com.com.eazybank.config")})

public class EazyBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyBankApplication.class, args);
	}

}
