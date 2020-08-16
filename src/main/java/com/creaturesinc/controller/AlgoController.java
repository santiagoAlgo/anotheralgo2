package com.creaturesinc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlgoController {
	

	
	@Value( "${algo.name}" )
	private String name;


	@GetMapping("/algo")
	public String getAlgo() {
		//return "algo 2 "+env.getProperty("agent007");
		return "algo 2 "+name;
	} 
	
}
