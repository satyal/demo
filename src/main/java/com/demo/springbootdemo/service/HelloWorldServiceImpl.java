package com.demo.springbootdemo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	public String getMessage() {
		return "Hello";
	}

}
