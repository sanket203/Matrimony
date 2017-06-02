package com.i3.matrimony.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.i3.matrimony.dao.PersonalInfoDao;
import com.i3.matrimony.model.PersonalInformation;
import com.i3.matrimony.service.PersonalInfoService;
import com.i3.matrimony.utils.ResponseMessage;
import com.i3.matrimony.utils.Validations;

@Service(value = PersonalInfoServiceImpl.SERVICE_NAME)
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PersonalInfoServiceImpl implements PersonalInfoService {
	
	public static final String SERVICE_NAME = "PersonalInfoService";
	
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
			message = personalInfoDao.addPersonalInfo(userJson);
			PersonalInformation user = personalInfoDao.getPersonalInformation(userJson.getEmail());
			responseMessage = new ResponseMessage("200", message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			responseMessage = new ResponseMessage("500", e.getMessage());
		}
		return responseMessage;
	}

}
