package com.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		return "User Service Down At This Moment";
	}
	
	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback() {
		return "Contact Service Down At This Moment";
	}

}
