package com.demo.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springbootdemo.service.HelloWorldService;

@RestController
public class HelloWorlController {
	
	@Autowired
	HelloWorldService helloWorldService;
	
	@GetMapping("/test")
	public String getMessage(){
		String message = helloWorldService.getMessage();
		return message;
	}

}
