package com.oedevopspipe.demopipe;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@GetMapping("/courses")
	public String getAllCourses()
	{	
		return "hello world";
		
	}
}
