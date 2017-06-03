package com.i3.matrimony.service.impl;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.i3.matrimony.dao.AcademicDetailsDao;
import com.i3.matrimony.dao.PersonalInfoDao;
import com.i3.matrimony.dao.PhysicaDetailsDao;
import com.i3.matrimony.dao.ProfessionalDetailsDao;
import com.i3.matrimony.dao.ProfileFilterDao;
import com.i3.matrimony.model.AcademicDetails;
import com.i3.matrimony.model.PersonalInformation;
import com.i3.matrimony.model.PhysicalDetails;
import com.i3.matrimony.model.ProfessionalDetails;
import com.i3.matrimony.pojo.SessionObject;
import com.i3.matrimony.pojo.ViewDetails;
import com.i3.matrimony.service.ProfileFilterService;
import com.i3.matrimony.utils.ResponseMessage;

@Service(value = ProfileFilterServiceImpl.SERVICE_NAME)
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProfileFilterServiceImpl implements ProfileFilterService{
	
public static final String SERVICE_NAME = "ProfileFilterServiceImpl";
	
	@Autowired
	private PersonalInfoDao personalInfoDao;

	@Autowired
	private AcademicDetailsDao academicDetailsDao;
	
	@Autowired
	private ProfessionalDetailsDao professionalDetailsDao;
	
	@Autowired
	private PhysicaDetailsDao physicalDetailsDao;
	
	@Autowired
	private ProfileFilterDao profileFilterDao;
	
	@Override
	public ResponseMessage getProfileById(String profileId) {
		ResponseMessage message = null;
		ViewDetails viewDetails = new ViewDetails();
		PersonalInformation personalData;
		try {
			 personalData = personalInfoDao.getPersonalInformation(profileId);
			 if(personalData != null){
				 viewDetails = setViewDetails(personalData);
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

	@Override
	public ResponseMessage getRecentLoggedInProfile(final SessionObject sessionData) {
		ResponseMessage response = null;
		List<PersonalInformation> personalData = new LinkedList<PersonalInformation>();
		List<ViewDetails> viewList = new LinkedList<ViewDetails>();
		try {
				if(sessionData.getUserId().startsWith("F")){
					personalData = profileFilterDao.getMaleProfiles(sessionData);
				} else{
					personalData = profileFilterDao.getFemaleProfiles(sessionData);
				}
				if(personalData.size()>0){
					for (PersonalInformation personalInformation : personalData) {
						ViewDetails view = setViewDetails(personalInformation);
						viewList.add(view);
					}
				} else {
					throw new Exception("No records found");
				}
				response = new ResponseMessage("200", null);
				response.setData(viewList);
		} catch(Exception ex) {
			response = new ResponseMessage("500", ex.getMessage());
		}
		
		return response;
	}
	
	private ViewDetails setViewDetails(PersonalInformation personalInfo) throws Exception{
		ViewDetails viewDetails = new ViewDetails();
		viewDetails.setFullName(personalInfo.getFirstName()+" "+personalInfo.getLastName());
		viewDetails.setProfileId(String.valueOf(personalInfo.getUserId()));
		viewDetails.setBirthDate(getDate(personalInfo.getDateOfBirth().getTime()));
		viewDetails.setLastLogin(getDate(personalInfo.getLastLogin().getTime()));
		AcademicDetails academicDetails = academicDetailsDao.getAcademicDetailsById(personalInfo.getUserId());
		if(academicDetails != null){
			viewDetails.setQualification(academicDetails.getDegrees());
		}
		ProfessionalDetails profession = professionalDetailsDao.getProfessionalDetailsById(personalInfo.getUserId());
		if(profession != null){
			int monthlyIncome = Integer.parseInt(profession.getAnnualIncome())/12;
			viewDetails.setMonthlyIncome(String.valueOf(monthlyIncome));
			viewDetails.setWorkLocation(profession.getWorkLocation());
		}
		PhysicalDetails physical = physicalDetailsDao.getPhysicalDetailsById(personalInfo.getUserId());
		if(physical != null){
			viewDetails.setHeight(physical.getHeight());
		}
		return viewDetails;
	}

}
