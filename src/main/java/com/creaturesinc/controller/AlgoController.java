package com.creaturesinc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class AlgoController {
	

	
	@Value( "${algo.name}" )
	private String name;

	@Value("${algo.secret.question}")
	private String questionDisp;
	
	@Value("${algo.db.url}")
	private String dbUrl;
	
	@Value("${algo.db.user}")
	private String dbUser;

	@GetMapping("/algo")
	public String getAlgo() {
		//return "algo 2 "+env.getProperty("agent007");
		return "algo 3 "+name+"<br>"+questionDisp+"<br><ul><il>"+dbUrl+"</il><il>"+dbUser+"</il></ul>";
	} 
	
}
