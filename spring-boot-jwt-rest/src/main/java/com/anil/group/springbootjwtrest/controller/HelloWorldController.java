package com.anil.group.springbootjwtrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/hello")
	public String firstPage() {
		return "HelloWorld";
	}
}
