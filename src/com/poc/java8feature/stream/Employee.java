package com.poc.java8feature.stream;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private Date dateOfBirth;
	private String desgination;
	
	public Employee(int id, String name, String desgination) {
		super();
		this.id = id;
		this.name = name;
		this.desgination = desgination;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesgination() {
		return desgination;
	}

	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desgination=" + desgination + "]";
	}
	
	
	
}
