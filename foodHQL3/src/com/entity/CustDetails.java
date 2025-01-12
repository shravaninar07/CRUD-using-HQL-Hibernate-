package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	private String name;
	private String address;
	private String gender;
	private long mobileNo;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public CustDetails(int custId, String name, String address, String gender, long mobileNo) {
		super();
		this.custId = custId;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.mobileNo = mobileNo;
	}

	public CustDetails() {

	}

	@Override
	public String toString() {
		return "CustDetails [custId=" + custId + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + "]";
	}

}
