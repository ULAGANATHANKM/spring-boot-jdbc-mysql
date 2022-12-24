package com.ebrain.springboot.training.demotraining.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebrain.springboot.training.demotraining.dto.HelloWorld;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	
	@GetMapping(value = "/get")
	public String helloWordWelcomeMessage() {
		
		return "Welcome to Spring Boot Hello World Demo Training";
	}
	
	
	public void servletPost( HttpServletRequest request, HttpServletResponse response) {
		
		
		String name = request.getParameter("name");
		
		String email = request.getParameter("email");
		
		HelloWorld obj = new HelloWorld();
		
		obj.setName(name);
		obj.setEmail(email);
		
		
		
		 
	}
	
	
	@PostMapping(value = "/post")
	public HelloWorld postHelloWorldMessage( @RequestBody HelloWorld request ) {
		
		System.out.println("Name : "+request.getName());
		
		request.setMessage("Post Mapping Called Successfully");
		
		return request;
	}
	
}
