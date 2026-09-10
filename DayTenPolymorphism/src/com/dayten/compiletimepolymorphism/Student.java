package com.dayten.compiletimepolymorphism;

public class Student {
	
	public void StudentDetails()
	{
		System.out.println("Please enter your details");
	}

	public void StudentDetails(int id, String name)
	{
		//System.out.println("Please enter your details");
	}
	
	public String StudentDetails(String name, int id)
	{
		//System.out.println("Please enter your details");
	return name;
	}
	
	public void StudentDetails(String name, short id)
	{
		//System.out.println("Please enter your details");
	}
	
}
