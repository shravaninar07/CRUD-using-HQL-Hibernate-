package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TrekkerDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int T_ID;
	private String name;
	private String desg;
	private int T_amount;
	
	
	
	public int getT_ID() {
		return T_ID;
	}
	public void setT_ID(int t_ID) {
		T_ID = t_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getT_amount() {
		return T_amount;
	}
	public void setT_amount(int t_amount) {
		T_amount = t_amount;
	}
	
	public TrekkerDetails() {
		
	}
	
	public TrekkerDetails(int t_ID, String name, String desg, int t_amount) {
		super();
		T_ID = t_ID;
		this.name = name;
		this.desg = desg;
		T_amount = t_amount;
	}
	
	
	@Override
	public String toString() {
		return "TrekkerDetails [T_ID=" + T_ID + ", name=" + name + ", desg=" + desg + ", T_amount=" + T_amount + "]";
	}
	
	
	
	
	

}
