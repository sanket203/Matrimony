package com.i3.matrimony.service;

import com.i3.matrimony.model.PersonalInformation;
import com.i3.matrimony.utils.ResponseMessage;

public interface PersonalInfoService {
	
	ResponseMessage addUser(final PersonalInformation userJson);
}
