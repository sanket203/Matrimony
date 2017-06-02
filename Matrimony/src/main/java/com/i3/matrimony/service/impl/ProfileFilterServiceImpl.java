package com.i3.matrimony.service.impl;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.i3.matrimony.dao.AcademicDetailsDao;
import com.i3.matrimony.dao.PersonalInfoDao;
import com.i3.matrimony.dao.PhysicaDetailsDao;
import com.i3.matrimony.dao.ProfessionalDetailsDao;
import com.i3.matrimony.model.AcademicDetails;
import com.i3.matrimony.model.PersonalInformation;
import com.i3.matrimony.model.PhysicalDetails;
import com.i3.matrimony.model.ProfessionalDetails;
import com.i3.matrimony.pojo.ViewDetails;
import com.i3.matrimony.service.ProfileFilterService;
import com.i3.matrimony.utils.ResponseMessage;

@Service(value = ProfileFilterServiceImpl.SERVICE_NAME)
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProfileFilterServiceImpl implements ProfileFilterService{
	
public static final String SERVICE_NAME = "PersonalInfoService";
	
	@Autowired
	private PersonalInfoDao personalInfoDao;

	@Autowired
	private AcademicDetailsDao academicDetailsDao;
	
	@Autowired
	private ProfessionalDetailsDao professionalDetailsDao;
	
	@Autowired
	private PhysicaDetailsDao physicalDetailsDao;
	
	@Override
	public ResponseMessage getProfileById(long profileId) {
		ResponseMessage message = null;
		ViewDetails viewDetails = new ViewDetails();
		PersonalInformation personalData;
		try {
			 personalData = personalInfoDao.getPersonalInformation(profileId);
			 if(personalData != null){
				viewDetails.setFullName(personalData.getFirstName()+" "+personalData.getLastName());
				viewDetails.setProfileId(String.valueOf(personalData.getUserId()));
				viewDetails.setBirthDate(getDate(personalData.getDateOfBirth().getTime()));
				viewDetails.setLastLogin(getDate(personalData.getLastLogin().getTime()));
				AcademicDetails academicDetails = academicDetailsDao.getAcademicDetailsById(profileId);
				if(academicDetails != null){
					viewDetails.setQualification(academicDetails.getDegrees());
				}
				ProfessionalDetails profession = professionalDetailsDao.getProfessionalDetailsById(profileId);
				if(profession != null){
					int monthlyIncome = Integer.parseInt(profession.getAnnualIncome())/12;
					viewDetails.setMonthlyIncome(String.valueOf(monthlyIncome));
					viewDetails.setWorkLocation(profession.getWorkLocation());
				}
				PhysicalDetails physical = physicalDetailsDao.getPhysicalDetailsById(profileId);
				if(physical != null){
					viewDetails.setHeight(physical.getHeight());
				}
			 }
			 message = new ResponseMessage("200", null);
			 message.setData(viewDetails);
		} catch (Exception e) {
			message = new ResponseMessage("500", e.getMessage());
		}
		return message;
	}
	
	private String getDate(long dateTime){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String format = formatter.format(dateTime);
		return format;
	}

	@Override
	public ResponseMessage getMatchingProfile() {
		// TODO Auto-generated method stub
		return null;
	}

}
