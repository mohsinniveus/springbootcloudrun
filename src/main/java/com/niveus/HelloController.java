package com.niveus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	String welcome(@RequestParam(required = false) String foo) {
		
		return "Niveus --- Cloud Run Demo with Build Back ------ 1.0.0";
	}
	
	@GetMapping("/hello")
	String hello(@RequestParam(required = false) String foo) {
		
		String message = "Hello from Cloud Run 1.0.0.";	
		return message;
	}

	

}
