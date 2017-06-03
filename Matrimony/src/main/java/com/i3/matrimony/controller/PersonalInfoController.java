package com.i3.matrimony.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.i3.matrimony.model.PersonalInformation;
import com.i3.matrimony.pojo.LoginDetails;
import com.i3.matrimony.pojo.SessionObject;
import com.i3.matrimony.service.PersonalInfoService;
import com.i3.matrimony.utils.ResponseMessage;

@Controller
public class PersonalInfoController {

	@Autowired
	private PersonalInfoService personalInfoService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody ResponseMessage addUser(
			@RequestBody final PersonalInformation userJson) {

		ResponseMessage message = personalInfoService.addUser(userJson);
		return message;
	}
	
	@RequestMapping(value = "/validateUser", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody ResponseMessage authenticateUser(@RequestBody final LoginDetails loginDetails,HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(true);
		SessionObject sessionObject = new SessionObject();
		ResponseMessage message = personalInfoService.validateUser(loginDetails, sessionObject);
		if(message.getStatus() == "200"){
			session.setAttribute("sessionData", sessionObject);
		}
		return message;
	}
}
