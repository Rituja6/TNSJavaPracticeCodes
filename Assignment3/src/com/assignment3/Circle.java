package com.assignment3;
import java.util.Scanner;

public class Circle {
	private double radius;
	private String colour;
	
	public void getInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius for circle:");
		radius=sc.nextDouble();
		System.out.println("Enter colour for circle(Note that:spaces are not allowed):");
		colour=sc.next();
		
		sc.close();
	}
	
	public void calculateArea() {
		double area;
		area=3.14*radius*radius;
		
		System.out.println("---Circle Details---");
		System.out.println("Radius of circle is:"+radius);
		System.out.println("Colour of circle is:"+colour);
	}
}
