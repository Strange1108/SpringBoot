package com.learn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {
	
	@GetMapping("/home")
	public String home()
	{
		return "This is the home page";
	}
	
	@GetMapping("/login")
	public String Login()
	{
		return "This is the Login page";
	}
	
	@GetMapping("/register")
	public String Register()
	{
		return "This is the Register page";
	}
}
