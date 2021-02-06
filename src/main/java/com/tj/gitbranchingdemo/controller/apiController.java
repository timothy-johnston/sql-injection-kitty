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

//	@PostMapping("/api/submit-entry")
//	public int handleSubmitEntry(@Valid @RequestBody LogEntry submission) {
//		
//		System.out.println("Here I am in the entry submission endpoint!");
//		
//		return 0;
//		
//	}
	
	@PostMapping("/api/submit-entry")
	public int handleSubmitEntry(@RequestBody LogEntry submission) {
		
		System.out.println("Here I am in the entry submission endpoint!");
		
		return 0;
		
	}
	
}
