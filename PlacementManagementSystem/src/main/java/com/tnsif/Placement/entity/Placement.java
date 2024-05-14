package com.tnsif.Placement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Placement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer regid;
	private String name;
	private String dept;
	private double cgpa;
	
	
	
	
	public Placement() {
		super();
	}
	
	
	public Placement(String name, String dept, double cgpa) {
		super();
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
	}
	
	public Integer getRegid() {
		return regid;
	}
	public void setRegid(Integer regid) {
		this.regid = regid;
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
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	
	

}
