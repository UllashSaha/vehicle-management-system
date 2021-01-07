package com.saha.vehicleManagement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	@GetMapping("/index") // if I get /index     
    public String goHome() {
    	return "index";   //it will return the index.html page
    }
	
	@GetMapping("/login") // if I get /index     
    public String login() {
    	return "login";   //it will return the index.html page
    }
	@GetMapping("/logout") // if I get /index     
    public String logout() {
    	return "login";   //it will return the index.html page
    }
}
