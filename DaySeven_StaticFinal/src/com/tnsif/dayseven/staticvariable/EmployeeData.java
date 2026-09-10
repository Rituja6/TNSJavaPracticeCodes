//Program to demonstrate static variable
package com.tnsif.dayseven.staticvariable;

public class EmployeeData {

	public static void main(String[] args) {

		Employee e = new Employee("Nayna", 123);
		System.out.println(e);
		
		Employee e1 = new Employee("Priya", 124);
		System.out.println(e1);
	}

}
