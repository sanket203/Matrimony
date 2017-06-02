package com.i3.matrimony.dao;

import com.i3.matrimony.model.ProfessionalDetails;

public interface ProfessionalDetailsDao {

    public String createProfessionaalProfile(final ProfessionalDetails professionalData);
	
	public ProfessionalDetails getProfessionalDetailsById(final long userId) throws Exception;

}
