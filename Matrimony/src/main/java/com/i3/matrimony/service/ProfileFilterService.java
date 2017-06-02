package com.i3.matrimony.service;

import java.util.List;

import com.i3.matrimony.pojo.ViewDetails;
import com.i3.matrimony.utils.ResponseMessage;

public interface ProfileFilterService {

	public ResponseMessage getProfileById(long profileId);
	
	public ResponseMessage getMatchingProfile();
}
