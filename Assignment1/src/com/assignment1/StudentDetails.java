package com.assignment1;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Full Name with Initial:");
		String name=sc.nextLine();
		System.out.println("Enter Roll No:");
		int roll_no=sc.nextInt();
		System.out.println("Enter Grade(Single character):");
		String grade=sc.next();
		System.out.println("Enter Percentage without '%' sign:");
		int percentage=sc.nextInt();
		
		System.out.println("Name:"+name+","+"Roll No:"+roll_no+","+"Grade:"+grade+","+"Percentage:"+percentage);
		
		sc.close();
	}

}
