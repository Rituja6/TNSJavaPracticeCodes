package com.dayeleven.stringdemo;

public class SampleString {

	public static void main(java.lang.String[] args) {

       // array 
		char c[] = { 'I', 'N', 'D', 'I', 'A'};
		String s1 = new String(c);
		
		System.out.println(s1);
		
		// object type
		String s2 = new String("Java");
		System.out.println(s2);
		
		//primitive type // string literal
		String s3 = "Cyber Security";
		System.out.println(s3);
	}
}
