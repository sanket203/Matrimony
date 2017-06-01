package com.i3.matrimony.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="PhysicalDetails")
public class PhysicalDetails {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="userId")
	private String userId;
	
	@Column(name="height")
	private String height;
	
	@Column(name="weight")
	private String weight;
	
	@Column(name="bloodGroup")
	private String bloodGroup;
	
	@Column(name="disability")
	private String disability;
	
	@Column(name="spects")
	private String spects;
	
	@Column(name="diet")
	private String diet;
	
	@Column(name="smoke")
	private String smoke;
	
	@Column(name="drink")
	private String drink;
	
	@Column(name="hobbies")
	private String hobbies;
	
	@Column(name="remark")
	private String remark;

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

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	public String getSpects() {
		return spects;
	}

	public void setSpects(String spects) {
		this.spects = spects;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getSmoke() {
		return smoke;
	}

	public void setSmoke(String smoke) {
		this.smoke = smoke;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
