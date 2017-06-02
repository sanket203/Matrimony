package com.i3.matrimony.utils;

import org.apache.commons.lang3.StringUtils;

import com.i3.matrimony.model.PersonalInformation;

public class Validations {
	
	public static void validatePersonalInfo(PersonalInformation personalInfo) throws Exception{
		
		validateData(personalInfo.getFirstName());
		validateData(personalInfo.getLastName());
		validateData(personalInfo.getEmail());
		validateData(personalInfo.getPassword());
	}

	private static void validateData(String data) throws Exception {
		if(StringUtils.isEmpty(data)){
			throw new Exception("Field can not be empty");
		}
		
	}

}
