package com.i3.matrimony.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.i3.matrimony.dao.PersonalInfoDao;
import com.i3.matrimony.model.PersonalInformation;
import com.i3.matrimony.pojo.LoginDetails;
import com.i3.matrimony.pojo.SessionObject;
import com.i3.matrimony.service.PersonalInfoService;
import com.i3.matrimony.utils.ResponseMessage;
import com.i3.matrimony.utils.Validations;

@Service(value = PersonalInfoServiceImpl.SERVICE_NAME)
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PersonalInfoServiceImpl implements PersonalInfoService {
	
	public static final String SERVICE_NAME = "PersonalInfoServiceImpl";
	
	@Autowired
	PersonalInfoDao personalInfoDao;
	
	@Transactional
	@Override
	public ResponseMessage addUser(final PersonalInformation userJson) {
		// TODO Auto-generated method stub
		String message = null;
		ResponseMessage responseMessage = null;
		try {
		    Validations.validatePersonalInfo(userJson);
			userJson.setRegistrationDate(new Date());
			userJson.setLastLogin(new Date());
			String userId = createUserId(userJson.getGender());
			userJson.setUserId(userId);
			message = personalInfoDao.addPersonalInfo(userJson);
			message = message+"with user id " + userId;
			responseMessage = new ResponseMessage("200", message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			responseMessage = new ResponseMessage("500", e.getMessage());
		}
		return responseMessage;
	}

	private String createUserId(final String gender) {
		String userId = String.valueOf(new Date().getTime());
		if(gender.equalsIgnoreCase("male")){
			userId = "M"+userId;
		} else {
			userId = "F"+userId;
		}
		return userId;
	}

	@Override
	public ResponseMessage validateUser(LoginDetails loginDetails, SessionObject sessionData) {
		String message = null;
		ResponseMessage responseMessage = null;
		try {
			String email = loginDetails.getUserName();
			String password = loginDetails.getPassword();
			PersonalInformation user = personalInfoDao.validateUser(email, password);
			if(user != null){
				sessionData.setUserId(user.getUserId());
				sessionData.setUserName(user.getFirstName() + " " + user.getLastName());
				sessionData.setBirthDate(user.getDateOfBirth());
			} else {
				throw new Exception("User name and password does not match");
			}
			responseMessage = new ResponseMessage("200", message);
		} catch (Exception e) {
			responseMessage = new ResponseMessage("500", e.getMessage());
		}
		return responseMessage;
	}
	
	private String getDate(long dateTime){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String format = formatter.format(dateTime);
		return format;
	}

}
