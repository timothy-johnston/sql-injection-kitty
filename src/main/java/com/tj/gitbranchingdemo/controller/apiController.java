package com.tj.gitbranchingdemo.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tj.gitbranchingdemo.model.LogEntry;

@RestController
public class apiController {

	@PostMapping("/api/submit-entry")
	public int handleSubmitEntry() {
		
		
		
		return sum;
		
	}
	
	@GetMapping("/api/multiply")
	public int performMultiplication(@Valid @RequestBody LogEntry submission) {
		
		
		
		return 0;
		
	}
	
}
