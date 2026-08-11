package com.Assignment_5_String;
import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String str=sc.nextLine();
		sc.close();
		
		StringBuilder nonUpper=new StringBuilder();
		StringBuilder upper=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				upper.append(str.charAt(i));
			}else {
				nonUpper.append(str.charAt(i));
			}
		}
		System.out.println(nonUpper.toString()+upper.toString());
	}

}
