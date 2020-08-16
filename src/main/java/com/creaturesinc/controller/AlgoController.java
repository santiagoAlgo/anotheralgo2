package com.creaturesinc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlgoController {

	@GetMapping("/algo")
	public String getAlgo() {
		return "algo 2";
	} 
	
}
