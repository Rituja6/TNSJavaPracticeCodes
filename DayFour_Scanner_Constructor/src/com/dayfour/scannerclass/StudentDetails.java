package com.dayfour.scannerclass;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
  
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter Roll No :");
		int rollNo = sc.nextInt();
		System.out.println("Enter Student Name:");
		String name = sc.next();
		System.out.println("Enter Address : ");
		String address = sc.next();
		System.out.println("Enter MArks :");
		float marks = sc.nextFloat();
		System.out.println("Enter Mobile Number : ");
		long mobile = sc.nextLong();
		
		
		System.out.println("Roll No:" +rollNo+" Student Name: "+name+" Address : "+address+" Marks: "+marks+" Mobile: "+mobile);
	
	}

}
