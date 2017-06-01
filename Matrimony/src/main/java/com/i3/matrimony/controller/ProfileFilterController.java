package com.i3.matrimony.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.i3.matrimony.utils.ResponseMessage;

@EnableWebMvc
@Controller
public class ProfileFilterController {

	
	@RequestMapping(value="/searchById",method=RequestMethod.GET)
	public ResponseMessage getProfileById(@RequestParam("profileId") final String profileId) {
		ResponseMessage message = null;
		return null;
	}
}
