package com.i3.matrimony.dao;

import com.i3.matrimony.model.PhysicalDetails;

public interface PhysicaDetailsDao {

    public String createPhysicalDetails(final PhysicalDetails physicalData);
	
	public PhysicalDetails getPhysicalDetailsById(final String userId) throws Exception;

}
