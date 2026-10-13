package com.entity;

public class employee {
	
	int empId;
	String name;
	String city;

	Country con;

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public employee(int empId, String name, String city, Country con) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.con = con;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "employee [empId=" + empId + ", name=" + name + ", city=" + city + ", con=" + con + "]";
	}
	
	

}
