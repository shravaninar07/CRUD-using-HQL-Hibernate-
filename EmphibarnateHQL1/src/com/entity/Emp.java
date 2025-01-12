package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empRecords")
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empID;
	private String name;
	private String dept;
	private int salary;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Emp(int empID, String name, String dept, int salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public Emp() {
		
	}
	@Override
	public String toString() {
		return "Emp [empID=" + empID + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	

}
