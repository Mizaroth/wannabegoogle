package com.mizar.wannabegoogle.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WannabeGoogleController {

	@GetMapping(value = "/search", produces = MediaType.TEXT_PLAIN_VALUE)
	public String search(@RequestParam String q) {
		switch (q.toLowerCase()) {
		case "gherkin":
			return "cucumber";
		case "george martin":
			return "game of thrones";
		default:
			return "";
		}
	}
	
	@GetMapping("/")
	public String home() {
		return "Welcome!";
	}
}
