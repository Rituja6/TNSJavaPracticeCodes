package com.daynine.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {

   Student s =new Student(101, "Priya", 12000d, "C++");
   Student1 s1 =new Student1(101, "Priya", 12000d, "C++");
		
   if(s1 instanceof Registrable)
			System.out.println("Student is registered for the course");
		else 
			System.out.println("Student is not registered for the course");
	}

}
