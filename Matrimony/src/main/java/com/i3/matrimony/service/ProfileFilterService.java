package com.i3.matrimony.service;

import com.i3.matrimony.pojo.SessionObject;
import com.i3.matrimony.utils.ResponseMessage;

public interface ProfileFilterService {

	public ResponseMessage getProfileById(String profileId);
	
	public ResponseMessage getMatchingProfile();
	
	public ResponseMessage getRecentLoggedInProfile(final SessionObject sessionObject);
}
