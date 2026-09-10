// to demonstrate default and parameterized constructor
package com.dayfour.constructor;

public class Person {
	
	//default or non parameterized constructor
	
	public Person()
	{
		System.out.println("Default Constructor");
	}
	
	// parameterized constructor
	
	public Person(String name, int age)
	{
		System.out.println("Name : "+ name+ "Age : "+age);
	}
	
	public Person(int age, String name)
	{
		System.out.println("Name : "+ name+ "  Age : "+age);
	}
	

		public static void main(String[] args) {
			
			 Person obj1 = new  Person("vivek", 21);
			 Person obj2 = new  Person();
			 Person obj3 = new  Person(22, "Sakshi");


			 
			 

	}

}
