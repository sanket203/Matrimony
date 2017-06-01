package com.i3.matrimony.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="AcademicDetails")
public class AcademicDetails {
 
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="userId")
	private String userId;
	
	@Column(name="level")
	private String level;
	
	@Column(name="degree")
	private String degrees;
	
	@Column(name="university")
	private String university;
	
	@Column(name="passYear")
	private String passYear;

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

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getDegrees() {
		return degrees;
	}

	public void setDegrees(String degrees) {
		this.degrees = degrees;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getPassYear() {
		return passYear;
	}

	public void setPassYear(String passYear) {
		this.passYear = passYear;
	}
	
	
}
