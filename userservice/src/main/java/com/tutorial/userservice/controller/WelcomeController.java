package com.tutorial.userservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping(value="welcome")
	public ResponseEntity<?> welcome() {
		
		return ResponseEntity.ok("welcome to User service");
	}
	
	@GetMapping(value="/")
	public ResponseEntity<?> home() {
		
		return ResponseEntity.ok("welcome to User service home");
	}

}
