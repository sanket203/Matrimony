package com.i3.matrimony.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
public class PageMapperController {
	
	@RequestMapping(value="/")
    public String openIndexPage() {
		return "index";
	}
	
	@RequestMapping(value="/loginPage")
    public String openLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/registrationPage")
    public String openRegistrationPage() {
		return "register";
	}
	
	@RequestMapping(value="/matchesPage")
    public String openMatchesPage() {
		return "matches";
	}
	
	@RequestMapping(value="/contactPage")
    public String openContactPage() {
		return "contact";
	}
	
	@RequestMapping(value="/searchPage")
    public String openSearchPage() {
		return "search";
	}
	
	@RequestMapping(value="/searchByIdPage")
    public String openSearchByIdPage() {
		return "search-id";
	}
	
	@RequestMapping(value="/viewProfilePage")
    public String openViewProfilePage() {
		return "view-profile";
	}
}
