package com.welcomeRestapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestApi {
	
	@Autowired
	private Environment env;
	
	
	@GetMapping("/welcome")
	public String welcomeRest() {
	String port=	env.getProperty("server.port");
		String msg="welcome to home ("+port+")";
		return msg;
	}
	

}
