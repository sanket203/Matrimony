package com.i3.matrimony.dao;

import com.i3.matrimony.model.PersonalInformation;

public interface PersonalInfoDao {

	public String addPersonalInfo(final PersonalInformation personalinfo) throws Exception;
	
	public String editPersonalInfo(final PersonalInformation personalinfo) throws Exception;
	
	public PersonalInformation getPersonalInformation(long id) throws Exception; 
}
