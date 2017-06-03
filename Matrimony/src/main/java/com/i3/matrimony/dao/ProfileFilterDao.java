package com.i3.matrimony.dao;

import java.util.List;

import com.i3.matrimony.model.PersonalInformation;
import com.i3.matrimony.pojo.SessionObject;

public interface ProfileFilterDao {

	public List<PersonalInformation> getMaleProfiles(SessionObject sessionObject) throws Exception;
	
	public List<PersonalInformation> getFemaleProfiles(SessionObject sessionObject) throws Exception;
	
    public List<PersonalInformation> getNewMaleProfiles(SessionObject sessionObject) throws Exception;
	
	public List<PersonalInformation> getNewFemaleProfiles(SessionObject sessionObject) throws Exception;
}
