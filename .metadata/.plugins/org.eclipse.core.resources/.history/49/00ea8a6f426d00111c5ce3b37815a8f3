package com.greetRestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greetRestapi.client.WelcomeFeignclientApi;

@RestController
public class GreetController {
	@Autowired
	private WelcomeFeignclientApi welcomefeign;
	
	@Autowired
	private Environment env;

	@GetMapping("/greet")
	public String greetMsg() {

		String welcomeResp = welcomefeign.invokewelcomeApi();

		String port = env.getProperty("server.port");

		String greetResp = "Good Morning (" + port + "), ";

		return greetResp + welcomeResp;

}
}