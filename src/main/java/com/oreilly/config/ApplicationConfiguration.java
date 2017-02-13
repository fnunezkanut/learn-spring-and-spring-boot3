package com.oreilly.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.oreilly")
public class ApplicationConfiguration {

	@Bean
	public String message(){

		return "Hello OReilly";
	}
}
