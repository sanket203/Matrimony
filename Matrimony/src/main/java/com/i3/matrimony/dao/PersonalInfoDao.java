package com.i3.matrimony.dao;

import com.i3.matrimony.model.PersonalInformation;

public interface PersonalInfoDao {

	public String addPersonalInfo(final PersonalInformation personalinfo) throws Exception;
	
	public String editPersonalInfo(final PersonalInformation personalinfo) throws Exception;
	
	public PersonalInformation getPersonalInformation(String userId) throws Exception; 
	
	//public PersonalInformation getPersonalInformation(String email) throws Exception; 
	
	public PersonalInformation validateUser(String email, String password) throws Exception; 
	
	
}
