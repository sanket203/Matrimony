package com.i3.matrimony.service;

import com.i3.matrimony.model.PersonalInformation;
import com.i3.matrimony.pojo.LoginDetails;
import com.i3.matrimony.pojo.SessionObject;
import com.i3.matrimony.utils.ResponseMessage;

public interface PersonalInfoService {
	
	ResponseMessage addUser(final PersonalInformation userJson);
	
	ResponseMessage validateUser(final LoginDetails loginDetails, SessionObject sessionObject);
}
