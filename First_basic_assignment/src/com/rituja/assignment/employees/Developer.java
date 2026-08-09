package com.rituja.assignment.employees;

public class Developer extends Employee{
	private String programminglanguage;
	
	public Developer(String name, int employeeId, double salary,String programminglanguage) {
		super(name,employeeId,salary);
		this.programminglanguage=programminglanguage;
	}

	public String getProgramminglanguage() {
		return programminglanguage;
	}

	public void setProgramminglanguage(String programminglanguage) {
		this.programminglanguage = programminglanguage;
	}
	
	
}
