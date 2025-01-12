package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	private String name;
	private long M_no;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getM_no() {
		return M_no;
	}

	public void setM_no(long m_no) {
		M_no = m_no;
	}

	public Student(int rollno, String name, long m_no) {
		super();
		this.rollno = rollno;
		this.name = name;
		M_no = m_no;
	}

	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", M_no=" + M_no + "]";
	}

}
