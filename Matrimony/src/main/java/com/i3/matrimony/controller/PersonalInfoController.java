package com.i3.matrimony.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.i3.matrimony.model.PersonalInformation;
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
}
