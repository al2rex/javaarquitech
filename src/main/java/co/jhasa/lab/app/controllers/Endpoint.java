package co.jhasa.lab.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {
	
	@GetMapping(value = "/here")
	public String endpoint() {
		return "Hola mundo";
	}
}
