package com.rituja.assignment.utilities;

import com.rituja.assignment.employees.Manager;
import com.rituja.assignment.employees.Developer;

public class EmployeeUtilities {
	public void printManagerDetails(Manager manager){
		System.out.println("---Manager Details---");
		System.out.println("ID:"+manager.getEmployeeId());
		System.out.println("Name:"+manager.getName());
		System.out.println("Salary:"+manager.getSalary());
		System.out.println("Department:"+manager.getDepartment());
	}
	
	public void printDeveloperDetails(Developer developer){
		System.out.println("---Developer Details---");
		System.out.println("ID:"+developer.getEmployeeId());
		System.out.println("Name:"+developer.getName());
		System.out.println("Salary:"+developer.getSalary());
		System.out.println("Department:"+developer.getProgramminglanguage());
	}
}
