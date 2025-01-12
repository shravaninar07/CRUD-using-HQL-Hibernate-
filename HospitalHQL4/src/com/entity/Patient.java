package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private String Dignose;
	private int  age;
	private String gender;
	private long mobileNo;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDignose() {
		return Dignose;
	}
	public void setDignose(String dignose) {
		Dignose = dignose;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Patient(int id, String name, String dignose, int age, String gender, long mobileNo) {
		super();
		Id = id;
		this.name = name;
		Dignose = dignose;
		this.age = age;
		this.gender = gender;
		this.mobileNo = mobileNo;
	}
	public Patient() {
		
	}
	
	@Override
	public String toString() {
		return "Patient [Id=" + Id + ", name=" + name + ", Dignose=" + Dignose + ", age=" + age + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + "]";
	}
	
	
	

}
