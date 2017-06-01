package com.i3.matrimony.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="ProfessionalDetails")
public class ProfessionalDetails {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="userId")
	private String userId;
	
	@Column(name="service")
	private String service;
	
	@Column(name="jobTitle")
	private String jobTitle;
	
	@Column(name="organization")
	private String organization;
	
	@Column(name="workLocation")
	private String workLocation;
	
	@Column(name="annualIncome")
	private String annualIncome;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="totalExperience")
	private String totalExperience;
	
	@Column(name="businessType")
	private String businessType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(String totalExperience) {
		this.totalExperience = totalExperience;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	
	
	
}
