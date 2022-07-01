package com.metaphorce.mx.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public class RestController {
	
	@GetMapping("/test")
	public String products() {
		return "Hola";
	}
	
}
