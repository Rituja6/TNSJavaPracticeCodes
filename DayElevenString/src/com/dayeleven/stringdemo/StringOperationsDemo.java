package com.dayeleven.stringdemo;

public class StringOperationsDemo {

	public static void main(String[] args) {
		
		String s1 = "We are Learning Java with SQL and JDBC.";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		String s2 = s1.trim();
		System.out.println(s2.length());
		System.out.println(s1.substring(7, 29));
		System.out.println(s1.substring(7));
		System.out.println(s1.charAt(8));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.replace('a', 'm'));
		


		
	}

}
