package com.niit.tlc.springmvc.model;

public class Employee {
	private String name;
	private long id;
	private String ContactNumber;

	public Employee(String name, String contactNumber) {
		super();
		this.name = name;
		ContactNumber = contactNumber;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
}
