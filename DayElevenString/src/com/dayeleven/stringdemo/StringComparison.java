package com.dayeleven.stringdemo;

public class StringComparison {

	public static void main(String[] args) {

		String s1 = "Good Morning";
		String s2 = "good morning";
		String s3 = new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1+ " Equals " +s3 + " -> "+ s1.equals(s3));
		System.out.println(s1+ " Equals " +s2 + " -> "+ s1.equals(s2));
		System.out.println(s1+ " Equals " +s2 + " -> "+ s1.equalsIgnoreCase(s2));
		System.out.println(s1+ " Equals " +s2 + " -> "+ (s1 == s3));
		
		// compareTo
		System.out.println(s1.compareTo("GOOD MORNING"));
		System.out.println(s1.compareTo(s2));


	}

}
