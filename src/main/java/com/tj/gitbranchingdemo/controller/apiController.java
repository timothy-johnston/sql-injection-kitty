package com.tj.gitbranchingdemo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
	public String handleSubmitEntry(@RequestBody LogEntry submission) {
		
		System.out.println("Here I am in the entry submission endpoint!");
		
		return "a json representation of the submitted entry, or just its id";
		
	}
	
	@GetMapping("/api/get-entry")
	public String handleGetEntry(@RequestParam int id) {
		
		System.out.println("Here I am in the entry submission endpoint!");
		
		return "a json representation of the requested entry";
		
	}
	
	@GetMapping("/api/get-entries")
	public String handleGetEntries() {
		
		return "json representation of all entries";
		
	}
	
}
