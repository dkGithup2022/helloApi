package com.hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping
	public String helloWorld() {
		return "Hello world";
	}

	@GetMapping("/hello")
	public String hello() {
		return "world";
	}
}
