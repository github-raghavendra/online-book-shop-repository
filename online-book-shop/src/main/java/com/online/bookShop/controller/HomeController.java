package com.online.bookShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(path = { "/", "/index" })
	public String getIndex() {
		return "index";
	}
	
	@GetMapping(path = "/sign-up")
	public String getSignUp() {
		return "sign-up";
	}
	
	@GetMapping(path = "/login")
	public String getLogin() {
		return "login";
	}
	
	
	
}
