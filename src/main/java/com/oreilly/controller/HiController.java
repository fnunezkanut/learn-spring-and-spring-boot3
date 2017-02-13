package com.oreilly.controller;

import com.oreilly.config.ApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@Import(ApplicationConfiguration.class)
public class HiController {

	@Value("${framework.name}")
	String name;

	@Autowired
	String message;

	@RequestMapping("/")
	public String hello(){

		return "hi";
	}

	@RequestMapping("/name")
	public String name(){

		return name;
	}
}
