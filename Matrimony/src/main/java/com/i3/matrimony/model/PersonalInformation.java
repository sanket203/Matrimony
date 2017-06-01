package com.i3.matrimony.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="PersonalInformation")
public class PersonalInformation {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="userId")
	private long userId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="middleName")
	private String middleName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dateOfBirth")
	private Date dateOfBirth;
	
	@Column(name="landline")
	private String landline;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="currentAddress")
	private String currentAddress;
	
	@Column(name="permanentAddress")
	private String permanentAddress;
	
	@Column(name="password")
	private String password;
	
	@Column(name="addedBy")
	private String addedBy;
	
	@Column(name="registrationDate")
	private Date registrationDate;
	
	@Column(name="lastLogin")
	private Date lastLogin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}


	@Override
	public String toString() {
		return "PersonalInformation [id=" + id + ", userId=" + userId
				+ ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", email=" + email + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + ", landline="
				+ landline + ", mobile=" + mobile + ", currentAddress="
				+ currentAddress + ", permanentAddress=" + permanentAddress
				+ ", password=" + password + "]";
	}
	
}
