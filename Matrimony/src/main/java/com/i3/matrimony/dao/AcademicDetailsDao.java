package com.i3.matrimony.dao;

import com.i3.matrimony.model.AcademicDetails;

public interface AcademicDetailsDao {
	
	public String createAcademicProfile(final AcademicDetails academicData);
	
	public AcademicDetails getAcademicDetailsById(final String userId) throws Exception;

}
