package com.oreilly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

	@RequestMapping("/message")
	public String message(){

		return this.message;
	}
}
