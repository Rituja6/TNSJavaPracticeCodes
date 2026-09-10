//Program to demonstrate static vatiable
package com.tnsif.dayseven.staticvariable;

public class Employee {
	
	//instance variable
	private String name;
	private int id;
	
	//static variable
	static String companyName= "TNSIF";

	
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", CompanyName = "+ companyName+"]";
	}
	
	

}
