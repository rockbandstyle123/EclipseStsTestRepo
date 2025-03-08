package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	
	@GetMapping("/hotel-mone")
	public String hotelMethodOne() {
		
		return "Keep Smiling";
	}

}
