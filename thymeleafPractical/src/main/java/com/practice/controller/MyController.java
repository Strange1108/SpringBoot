package com.practice.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	// http://localhost:8080/about

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler ...");
		// putting data in model
		model.addAttribute("name", "Durgesh Tiwari");
		model.addAttribute("currentDate", new Date().toLocaleString());
		// example
//		String nameString="abc";
//		nameString.toUpperCase();	
		return "about";
		// about.html
	}

	// handling iteration

	@GetMapping("/example-loop")
	public String iterateHandler(Model m) {
		// send

		// create a list , set collection
		List<String> names = List.of("Ankit", "Laxmi", "Karan", "John");
		m.addAttribute("names", names);
		return "iterate";
	}

	// handler for conditional statements
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.println("conditional handler executed..");
		m.addAttribute("isActive", false);
		m.addAttribute("gender", "F");
		List<Integer> list = List.of(12);
		m.addAttribute("mylist", list);
		return "condition";
	}

	// handler for including fragments
	@GetMapping("/service")
	public String servicesHandler(Model m) {
		m.addAttribute("title", "I like to eat samosa");
		m.addAttribute("subtitle", LocalDateTime.now().toString());
		// processing logic
		return "service";
	}

	// for new about
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutnew";
	}

	// for new about
	@GetMapping("/contact")
	public String contact(Model model) {
		
		//model.addAttribute("name","Durgesh Kumar Tiwari");
		return "contact";
	}

}
