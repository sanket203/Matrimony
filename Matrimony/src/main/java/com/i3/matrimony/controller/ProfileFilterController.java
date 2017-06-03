package com.i3.matrimony.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.i3.matrimony.pojo.SessionObject;
import com.i3.matrimony.service.ProfileFilterService;
import com.i3.matrimony.utils.ResponseMessage;

@EnableWebMvc
@Controller
public class ProfileFilterController {

	@Autowired
	ProfileFilterService profileFilterService;
	
	@RequestMapping(value="/searchById",method=RequestMethod.GET)
	public ResponseMessage getProfileById(@RequestParam("profileId") final String profileId) {
		ResponseMessage message = null;
		message = profileFilterService.getProfileById(profileId);
		return message;
	}
	
	@RequestMapping(value="/getRecentLoginProfile",method=RequestMethod.GET)
	public ResponseMessage getRecentLoggedInProfile(HttpServletRequest request,HttpServletResponse response) {
		HttpSession session = request.getSession();
		SessionObject  sessionData = (SessionObject) session.getAttribute("sessionData");
		ResponseMessage message = null;
		message = profileFilterService.getRecentLoggedInProfile(sessionData);
		return message;
	}
	
	@RequestMapping(value="/getNewProfile",method=RequestMethod.GET)
	public ResponseMessage getNewProfile() {
		ResponseMessage message = null;
		//message = profileFilterService.getProfileById(Long.parseLong(profileId));
		return message;
	}
	
	@RequestMapping(value="/getDetailProfile",method=RequestMethod.GET)
	public ResponseMessage getFullProfile(@RequestParam("profileId") final String profileId) {
		ResponseMessage message = null;
		//message = profileFilterService.getProfileById(Long.parseLong(profileId));
		return message;
	}
	
}
